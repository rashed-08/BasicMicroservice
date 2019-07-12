package com.web.stockservice.model;

import java.math.BigDecimal;

public class CurrencyConversion {

	private int id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity; 
	private BigDecimal totalCalculateAmout;
	private int port;

	public CurrencyConversion() {
		// TODO Auto-generated constructor stub
	}

	public CurrencyConversion(int id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculateAmout, int port) {
		this.id = id;
		this.from=from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculateAmout = totalCalculateAmout;
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculateAmout() {
		return totalCalculateAmout;
	}

	public void setTotalCalculateAmout(BigDecimal totalCalculateAmout) {
		this.totalCalculateAmout = totalCalculateAmout;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

}
