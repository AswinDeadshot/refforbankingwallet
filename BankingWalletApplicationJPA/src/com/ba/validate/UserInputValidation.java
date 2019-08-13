package com.ba.validate;

import com.ba.dao.BankDAO;
import com.ba.exep.UserValidationException;

public class UserInputValidation {

	BankDAO bankDAO=new BankDAO();
	
	public boolean checkAccNo(double accountNumber) {
	
		if (bankDAO.checkAccNo(accountNumber))
		{
			return true;
		}
		else
			return false;
	}

	public boolean checkPass(int pin, double accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
