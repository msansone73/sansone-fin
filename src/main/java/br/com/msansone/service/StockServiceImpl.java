package br.com.msansone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.model.Stock;
import br.com.msansone.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public Stock getStockById(Long id) {
		return stockRepository.findById(id).get();
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
