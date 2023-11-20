package com.model;

public class Banking {
	public int accNo;
	public int balance=0;
	public String name;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Banking [accNo=" + accNo + ", balance=" + balance + ", name=" + name + "]";
	}
	public Banking(int accNo, int balance, String name) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
	}
	public Banking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Banking(int accNo, int balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	
	
	
}