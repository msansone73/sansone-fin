package br.com.msansone.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Service;

@Service
public class LogConsumerRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("rabbitmq:testCamel")
		.to("file:destino/D4");	
	}

}
