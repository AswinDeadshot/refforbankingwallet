package com.ba.service;

import com.ba.dao.BankDAO;
import com.ba.pojo.Bank;

public class BankService {
	
	BankDAO bankDAO = new BankDAO();

	public void addAccount(Bank bank) {
		bankDAO.beginTransaction();
		bankDAO.addUserAccount(bank);
		bankDAO.commitTransaction();
	}

	public Bank checkBalance(Double accountNo)
	{
		Bank bank=bankDAO.getBalance(accountNo);
		return bank;
		
	}

	public Bank depositMoney(double accountNumber,long amount) {
		bankDAO.beginTransaction();
		Bank bank=bankDAO.depositMoney(accountNumber,amount);
		bankDAO.commitTransaction();
		return bank;
	}

	public Bank withdrawMoney(double accountNumber, long amount) {
		bankDAO.beginTransaction();
		Bank bank=bankDAO.withdrawMoney(accountNumber,amount);
		bankDAO.commitTransaction();
		return bank;
		
	}
}
