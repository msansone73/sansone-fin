package br.com.msansone.service;

import java.util.List;

import br.com.msansone.model.Transaction;

public interface TransactionService {

	Transaction getById(Long id);
	List<Transaction> getAll();
	Transaction addTransaction(Transaction transaction);
	Transaction updateTransaction(Long id, Transaction transaction);
	List<Transaction>  getByStockId(Long id);
	List<Transaction>  getByStockTag(String tag);
	
}
