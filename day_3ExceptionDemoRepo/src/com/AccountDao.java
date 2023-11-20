package com;

import exception.AccountNotFoundException;
import exception.AccountTransactionException;
import exception.CustomException;

public interface AccountDao {
	public void deposit(int accNo, float amt) throws CustomException, AccountNotFoundException;
	public float withdraw(int accNo, float amt)throws CustomException, AccountNotFoundException;
	public float balanceEnquiry(int accNo)throws CustomException, AccountNotFoundException;

	public void createAccount(int accNo, float amt, String name)throws CustomException;
	public void  fundTransfer(int fromAccNo, int toAccNo, float amt) throws AccountTransactionException, AccountNotFoundException;
	
}
