package br.com.msansone.camel.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import br.com.msansone.model.Stock;

@Component
public class ProcessaMensagem implements Processor {
	
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("aqui é process");
		String body = exchange.getMessage().getBody().toString();
		Gson gson = new Gson();	
		Stock stock = gson.fromJson(body, Stock.class);
		System.out.println("Consultado stock "+stock.getName());
		stock.setId(stock.getId()+5000);
		//exchange.setMessage(gson.toJson(stock));
		exchange.getMessage().setBody(gson.toJson(stock));
	}

}
