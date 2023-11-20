package com.psb;

import com.model.Banking;
import com.template.RBI;

public class PublicSector extends RBI{

	@Override
	public void withdrawService(Banking bank,int amount) {
		bank.balance-=amount;	
	}

	@Override
	public void showBalance(Banking bank) {
		System.out.println("Your  balance is: "+bank.balance);
		
	}

}