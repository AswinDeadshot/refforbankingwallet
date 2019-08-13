package com.ba.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Id;


@Entity
@Table(name="BankAccountStores")

public class Bank implements Serializable{
	@Id
	@Column(name="accNo", length=20)
	private double acNo;
	@Column(name="Name", length=20)
	private String name;
	@Column(name="phoneNo", length=20)
	private String number;
	@Column(name="DOB", length=20)
	private String dob;
	@Column(name="pin", length=20)
	private int pin;
	@Column(name="balance", length=20)
	private long balance;
	
	
	
	/**
	 * @return the acNo
	 */
	public double getAcNo() {
		return acNo;
	}


	/**
	 * @param acNo the acNo to set
	 */
	public void setAcNo(double acNo) {
		this.acNo = acNo;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	
	
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	/**
	 * @return the dob
	 */
	
	
	public String getDob() {
		return dob;
	}
	
	
	/**
	 * @param dob the dob to set
	 */
	
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	/**
	 * @return the pin
	 */
	
	
	public int getPin() {
		return pin;
	}
	
	
	/**
	 * @param pin the pin to set
	 */
	
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	/**
	 * @return the balance
	 */
	
	
	public long getBalance() {
		return balance;
	}
	
	
	/**
	 * @param balance the balance to set
	 */
	
	
	public void setBalance(long balance) {
		this.balance = balance;
	}


	public Bank(double acNo,String name, String number, String dob, int pin, long balance) {
		super();
		this.acNo=acNo;
		this.name = name;
		this.number = number;
		this.dob = dob;
		this.pin = pin;
		this.balance = balance;
	}


	public Bank() {
		super();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	@Override
	public String toString() {
		return "Bank [account no "+acNo+" name=" + name + ", number=" + number + ", dob=" + dob + ", pin=" + pin + ", balance=" + balance
				+ "]";
	}
	
	
	

}
