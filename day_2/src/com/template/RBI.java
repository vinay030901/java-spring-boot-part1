package com.template;

import com.model.Banking;

public abstract class RBI {
	public abstract void withdrawService(Banking  bank,int amount);
	public abstract void showBalance(Banking bank);
	public void issueCC() {
		System.out.println("No compulsion");
	}
}