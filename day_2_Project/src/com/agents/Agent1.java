package com.agents;

import com.inter.IRDAI;
import com.inter.RBI;
import com.inter.SEBI;
import com.models.Banking;
import com.models.Insurance;
import com.models.Stocks;

public class Agent1 implements SEBI, RBI, IRDAI {

	Banking bk=new Banking();
	Insurance ins=new Insurance();
	Stocks sto=new Stocks();
	@Override
	public void buyPolicy(Insurance in) {
		System.out.println("Policy type: " + in.insuranceType + "  is bought for premium: " + in.premium);
		ins.setInsuranceType(in.insuranceType);
		ins.setPremium(in.premium);
	}

	@Override
	public void claimPolicy(Insurance in) {
		// TODO Auto-generated method stub
		System.out.println("Policy of type: " + in.insuranceType + "  is claimed.");
	}

	@Override
	public void withdrawService(Banking bank, int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " is withdrawn from user " + bank.accNo);
		bk.setAccNo(bank.accNo);
		bk.setName(bank.name);
		bk.setBalance(bank.balance);
	}

	@Override
	public void showBalance(Banking bank) {
		// TODO Auto-generated method stub
		System.out.println("remaining balance: " + bank.balance);

	}

	@Override
	public void addStocks(Stocks st) {
		// TODO Auto-generated method stub
		System.out.println("stock of type " + st.stockId + " is bought.");
		sto.setStockId(st.stockId);
	}

	@Override
	public void sellStocks(Stocks st) {
		// TODO Auto-generated method stub
		System.out.println("stock of type " + st.stockId + " is sold.");
	}

}
