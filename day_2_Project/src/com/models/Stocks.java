package com.models;

public class Stocks {
	public int stockId,qty,price;
	public String stockName;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	@Override
	public String toString() {
		return "Stocks [stockId=" + stockId + ", qty=" + qty + ", price=" + price + ", stockName=" + stockName + "]";
	}
	public Stocks(int stockId, int qty, int price, String stockName) {
		super();
		this.stockId = stockId;
		this.qty = qty;
		this.price = price;
		this.stockName = stockName;
	}
	public Stocks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
