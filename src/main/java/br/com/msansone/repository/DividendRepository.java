package br.com.msansone.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.model.Dividend;

public interface DividendRepository extends JpaRepository<Dividend, Long>{

	List<Dividend> findAllByStockId(Long id);
	List<Dividend> findAllByStockIdAndReceivementDateLessThanEqual(Long id, Date data);

}
