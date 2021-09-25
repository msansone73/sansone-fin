package br.com.msansone.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import br.com.msansone.model.Dividend;
import br.com.msansone.service.DividendService;

@RestController
@RequestMapping("/dividend")
public class DividendController {
	
	@Autowired
	private DividendService dividendService;
	
	@GetMapping
	public ResponseEntity<List<Dividend>> getAll(){
		return ResponseEntity.ok(dividendService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Dividend> getById(@PathVariable Long id){
		return ResponseEntity.ok(dividendService.getById(id));
	}
	
	@GetMapping("/stock/{id}")
	public ResponseEntity<List<Dividend>> getByStockId(@PathVariable Long id){
		return ResponseEntity.ok(dividendService.getByStockId(id));
	}
	
	@GetMapping("/stock/{id}/DateAte/{date}")
	public ResponseEntity<List<Dividend>> getByStockId(@PathVariable Long id, @PathVariable String date){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date data=null;
		try {
			data = formatter.parse(date);
		} catch (ParseException e) {
			ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(dividendService.getByStockIdLessDate(id, data));
	}
	
	@PostMapping
	public ResponseEntity<Dividend> addDividend(@RequestBody Dividend dividend){
		return ResponseEntity.ok(dividendService.addDividend(dividend));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Dividend> updDividend(@PathVariable Long id, @RequestBody Dividend dividend){
		return ResponseEntity.ok(dividendService.updateDividend(id, dividend));
	}
	

}
