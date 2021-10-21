package br.com.msansone.service;

import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.com.msansone.model.Stock;
import br.com.msansone.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;
	
	@Autowired
	private CamelContext camelContext;
	
	@Override
	public Stock getStockById(Long id) {
		ProducerTemplate producerTemplate = camelContext.createProducerTemplate();
		Stock stock=stockRepository.findById(id).orElse(null);
		if (stock==null) {
			return null;
		}
		Gson gson = new Gson();
		//producerTemplate.sendBody("direct:log", gson.toJson(stock));
		producerTemplate.asyncRequestBody("direct:log", gson.toJson(stock));
		return stock;
	}

	@Override
	public List<Stock> getAllStocks() {
		return stockRepository.findAll();
	}

	@Override
	public Stock addStock(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Stock updateStock(Long id, Stock stock) {
		Stock temp = stockRepository.findById(id).orElse(null);
		temp.setName(stock.getName());
		temp.setTag(stock.getTag());
		stockRepository.save(temp);
		return temp;
	}

}
