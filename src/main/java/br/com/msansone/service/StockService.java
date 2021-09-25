package br.com.msansone.service;

import java.util.List;

import br.com.msansone.model.Stock;

public interface StockService {
	
	Stock getStockById(Long id);
	List<Stock> getAllStocks();
	Stock addStock(Stock stock);
	Stock updateStock(Long id, Stock stock);
	

}
