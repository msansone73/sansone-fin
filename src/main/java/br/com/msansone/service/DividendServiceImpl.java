package br.com.msansone.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.model.Dividend;
import br.com.msansone.repository.DividendRepository;

@Service
public class DividendServiceImpl implements DividendService {

	@Autowired
	private DividendRepository dividendRepository;

	@Override
	public Dividend getById(Long id) {
		return dividendRepository.findById(id).orElse(null);
	}

	@Override
	public List<Dividend> getAll() {
		return dividendRepository.findAll();
	}

	@Override
	public Dividend addDividend(Dividend dividend) {
		return dividendRepository.save(dividend);
	}

	@Override
	public Dividend updateDividend(Long id, Dividend dividend) {
		Dividend temp = this.getById(id);
		temp.setReceivementDate(dividend.getReceivementDate());
		temp.setReceivementValue(dividend.getReceivementValue());
		temp.setStock(dividend.getStock());
		return dividendRepository.save(temp);
	}

	@Override
	public List<Dividend> getByStockId(Long id) {
		return dividendRepository.findAllByStockId(id);
	}
	
	@Override
	public List<Dividend> getByStockIdLessDate(Long id, Date data) {
		return dividendRepository.findAllByStockIdAndReceivementDateLessThanEqual(id, data);
	}
	
	
	
}
