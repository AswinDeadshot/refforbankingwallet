package com.ba.dao;

import javax.persistence.EntityManager;


import com.ba.pojo.Bank;

public class BankDAO {

	private EntityManager entityManager;
	
	
	public BankDAO() {
		entityManager = JPAUtil.getEntityManager();
	}

	
	public void addUserAccount(Bank bank) {
		
		entityManager.persist(bank);
	
	}
	
	
	public Bank getBalance(double accountNo) {
		Bank bank=entityManager.find(Bank.class, accountNo);
		return bank;
	}
	
	
	public Bank depositMoney(double accountNumber,long amount) {
		Bank bank=entityManager.find(Bank.class, accountNumber);
		bank.setBalance(bank.getBalance()+amount);
		return bank;
	}
	
	
	public Bank withdrawMoney(double accountNumber, long amount) {
		Bank bank=entityManager.find(Bank.class, accountNumber);
		bank.setBalance(bank.getBalance()+amount);
		return null;
	}
	
	
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}


	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}


	public boolean checkAccNo(double accountnumber) {
		// TODO Auto-generated method stub
		return false;
	}





	


}
