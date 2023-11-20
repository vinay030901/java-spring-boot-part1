package com.inter;

import com.models.Banking;

public interface RBI {
	public  void withdrawService(Banking  bank,int amount);
	public  void showBalance(Banking bank);
}
