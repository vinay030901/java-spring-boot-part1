package com.psb;

import com.model.Banking;
import com.template.RBI;

public class PrivateSectorBank extends RBI {

	@Override
	public void withdrawService(Banking bank, int amount) {
		if (amount > 1000) {
			System.out.println("2% Service tax is taken");
			bank.balance -= (amount + 0.02 * amount);
		} else
			bank.balance -= amount;

	}

	@Override
	public void showBalance(Banking bank) {
		// TODO Auto-generated method stub
		System.out.println("Your  balance is: " + bank.balance);

	}

}
