package br.com.msansone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.model.Stock;
import br.com.msansone.service.StockService;

@RestController
@RequestMapping(value = "/stock")
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@GetMapping
	public ResponseEntity<List<Stock>> getAll(){
		return ResponseEntity.ok(stockService.getAllStocks());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Stock> getById(@PathVariable Long id){
		return ResponseEntity.ok(stockService.getStockById(id));
	}

	@PostMapping("")
	public ResponseEntity<Stock> addTransaction(@RequestBody Stock stock){
		return ResponseEntity.ok(stockService.addStock(stock));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Stock> updateTransacation(@RequestBody Stock stock, @PathVariable Long id){
		return ResponseEntity.ok(stockService.updateStock(id, stock));
	}

}

