package br.com.msansone.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Dividend {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date receivementDate;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	private Stock stock;
	private BigDecimal receivementValue;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getReceivementDate() {
		return receivementDate;
	}
	public void setReceivementDate(Date receivementDate) {
		this.receivementDate = receivementDate;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public BigDecimal getReceivementValue() {
		return receivementValue;
	}
	public void setReceivementValue(BigDecimal receivementValue) {
		this.receivementValue = receivementValue;
	}
	
	
	

}
