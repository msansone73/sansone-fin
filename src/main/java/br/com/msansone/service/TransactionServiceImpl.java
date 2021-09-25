package br.com.msansone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.model.Transaction;
import br.com.msansone.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public Transaction getById(Long id) {
		Transaction tran = transactionRepository.findById(id).orElse(null);
		return tran;
	}

	@Override
	public List<Transaction> getAll() {
		return transactionRepository.findAll();
	}

	@Override
	public Transaction addTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	public Transaction updateTransaction(Long id, Transaction transaction) {
		Transaction temp = transactionRepository.findById(id).orElse(null);
		temp.setPurchaseDate(transaction.getPurchaseDate());
		temp.setQuantity(transaction.getQuantity());
		temp.setStock(transaction.getStock());
		temp.setTransactionTypeEnum(transaction.getTransactionTypeEnum());
		temp.setUnitaryValue(transaction.getUnitaryValue());
		transactionRepository.save(temp);
		return temp;
	}

	@Override
	public List<Transaction> getByStockId(Long id) {
		return transactionRepository.findAllByStockId(id);
	}

	@Override
	public List<Transaction> getByStockTag(String tag) {
		return transactionRepository.findAllByStockTag(tag);
	}

}
