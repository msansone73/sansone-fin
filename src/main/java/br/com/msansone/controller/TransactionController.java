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

import br.com.msansone.model.Transaction;
import br.com.msansone.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;

	@GetMapping("/{id}")
	public ResponseEntity<Transaction> getById(@PathVariable Long id){
		return ResponseEntity.ok(transactionService.getById(id));		
	}
	
	@GetMapping("/stock/{id}")
	public ResponseEntity<List<Transaction>> getByStockId(@PathVariable Long id){
		return ResponseEntity.ok(transactionService.getByStockId(id));		
	}
	
	@GetMapping("/stock/tag/{tag}")
	public ResponseEntity<List<Transaction>> getByStockId(@PathVariable String tag){
		return ResponseEntity.ok(transactionService.getByStockTag(tag));		
	}
	
	@GetMapping()
	public ResponseEntity<List<Transaction>> getAll(){
		return ResponseEntity.ok(transactionService.getAll());		
	}
	
	@PostMapping("")
	public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction){
		return ResponseEntity.ok(transactionService.addTransaction(transaction));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Transaction> updateTransacation(@RequestBody Transaction transaction, @PathVariable Long id){
		Transaction tran = transactionService.updateTransaction(id, transaction);
		if (tran==null) {
			return  ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(tran);
	}

}
