package br.com.msansone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
