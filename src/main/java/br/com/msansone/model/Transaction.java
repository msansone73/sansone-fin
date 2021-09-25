package br.com.msansone.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date purchaseDate;
	private BigDecimal unitaryValue;
	private Long quantity;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	private Stock stock;
	@Enumerated(EnumType.ORDINAL)
	private TransactionTypeEnum transactionTypeEnum;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public BigDecimal getUnitaryValue() {
		return unitaryValue;
	}
	public void setUnitaryValue(BigDecimal unitaryValue) {
		this.unitaryValue = unitaryValue;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public TransactionTypeEnum getTransactionTypeEnum() {
		return transactionTypeEnum;
	}
	public void setTransactionTypeEnum(TransactionTypeEnum transactionTypeEnum) {
		this.transactionTypeEnum = transactionTypeEnum;
	}
	
	

}

