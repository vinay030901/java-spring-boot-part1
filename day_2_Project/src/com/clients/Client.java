package com.clients;

import com.agents.Agent1;
import com.models.Banking;
import com.models.Insurance;
import com.models.Stocks;

public class Client{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agent1 cl1=new Agent1();
		Stocks st=new Stocks(101,2,100,"tata");
		cl1.addStocks(st);
		cl1.sellStocks(st);
		
		Banking bank=new Banking(122,100,"Vinay");
		cl1.withdrawService(bank, 10);
		cl1.showBalance(bank);
		
		Insurance in=new Insurance("sunlife",20);
		cl1.buyPolicy(in);
		cl1.claimPolicy(in);
		
		Agent1 cl2=new Agent1();
		Stocks st1=new Stocks(102,3,90,"jio");
		cl2.addStocks(st1);
		cl2.sellStocks(st1);
	}

}
