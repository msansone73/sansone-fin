package br.com.msansone.service;

import java.util.Date;
import java.util.List;

import br.com.msansone.model.Dividend;

public interface DividendService {

	Dividend getById(Long id);
	List<Dividend> getAll();
	List<Dividend> getByStockId(Long id);
	List<Dividend> getByStockIdLessDate(Long id, Date data);
	Dividend addDividend(Dividend dividend);
	Dividend updateDividend(Long id, Dividend dividend);
	
}
