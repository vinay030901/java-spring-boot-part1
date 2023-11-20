package com.main;

import com.model.Banking;
import com.psb.PrivateSectorBank;
import com.psb.PublicSector;
import com.template.RBI;

public class BankingMain {

	public static void main(String[] args) {
		RBI psb = new PublicSector();
		Banking bank1 = new Banking(101, 10000, "vinay");
		psb.withdrawService(bank1, 1000);
		psb.showBalance(bank1);

		RBI prsb = new PrivateSectorBank();
		Banking bank2 = new Banking(102, 10000, "abhay");
		prsb.withdrawService(bank2, 1010);
//		prsb.withdrawService(bank2, 998);
		prsb.showBalance(bank2);
	}

}
