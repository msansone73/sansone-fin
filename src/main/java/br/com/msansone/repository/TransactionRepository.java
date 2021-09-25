package br.com.msansone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	List<Transaction> findAllByStockId(Long id);

	List<Transaction> findAllByStockTag(String tag);

}
