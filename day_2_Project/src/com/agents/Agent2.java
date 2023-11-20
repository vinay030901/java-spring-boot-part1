package com.agents;

import com.inter.RBI;
import com.inter.SEBI;
import com.models.Banking;
import com.models.Stocks;

public class Agent2 implements RBI, SEBI {

	@Override
	public void addStocks(Stocks st) {
		// TODO Auto-generated method stub
		System.out.println("stock of type " + st.stockId + " is bought.");

	}

	@Override
	public void sellStocks(Stocks st) {
		// TODO Auto-generated method stub
		System.out.println("stock of type " + st.stockId + " is sold.");

	}

	@Override
	public void withdrawService(Banking bank, int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " is withdrawn from user " + bank.accNo);

	}

	@Override
	public void showBalance(Banking bank) {
		// TODO Auto-generated method stub
		System.out.println("remaining balance: " + bank.balance);

	}

}