package br.com.msansone.camel.route;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogRoute extends RouteBuilder {

	@Autowired
	private Processor processaMensagem;
	
	@Override
	public void configure() throws Exception {
	
		from("direct:log")
		.process(processaMensagem)
		.choice()
			.when().jsonpath("$[?(@.tag=='HGRU11')]]")
				.to("file:destino/D1")
			.when().jsonpath("$[?(@.tag=='HGRE11')]]")
					.to("file:destino/D2")				
			.when().jsonpath("$[?(@.tag=='XPLG11')]]")
				.to("file:destino/D3")
			.when().jsonpath("$[?(@.tag=='CPTS11')]]")
				//.to("file:destino/D4")
				.to("rabbitmq:testCamel")				
			.otherwise()
				.to("file:destino");
	}

}
