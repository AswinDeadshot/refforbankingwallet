package com.ba.ui;

import java.util.Scanner;

import com.ba.pojo.Bank;
import com.ba.service.BankService;

public class BankUserUI {

	public static void main(String args[])
	{
		Bank bank; 
		BankService bankService=new BankService();
		Scanner scanner = new Scanner(System.in);
		 int choice;
		 while(true)
		 {
			 	System.out.println("Welcome to xyz bank wallet");
	            System.out.println("Choose any of these options from one to seven");
	            System.out.println("1.Create an Account");
	            System.out.println("2.Check your Balance");
	            System.out.println("3.Deposit Money");
	            System.out.println("4.Withdraw Money");
	            System.out.println("5.Transfer Money");
	            System.out.println("6.View Transaction");
	            System.out.println("7.Exit");
	            choice = scanner.nextInt();
	            switch(choice)
	            {
	            case 1:
	            {
	            	 System.out.println("ENTER YOUR NAME:");
	                 String name=scanner.next();
	                 System.out.println("ENTER YOUR DATE OF BIRTH IN DD/MM/YYYY");
	                 String dob=scanner.next();
	                 System.out.println("ENTER YOUR PHONE NUMBER ( MUST CONTAIN ONLY TEN DIGITS )");
	                 String phno=scanner.next();
	                 System.out.println("ENTER YOUR SECURITY PIN ( ONLY 4 DIGIT NUMBERS )");
	                 int pin=scanner.nextInt();
	                 System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
	                 long amt=scanner.nextLong();
	                 double acno = (Math.random()%100)*1457863;
	                 System.out.println(acno);
	                 bank=new Bank(acno,name,dob,phno,pin,amt);
	                 bankService.addAccount(bank);
                   break;
	            }
	            case 2:
	            {
	            	System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
	            	double accountNumber=scanner.nextDouble();
	            	bank=bankService.checkBalance(accountNumber);
	            	System.out.println("Your Account has a balance of Rs."+bank.getBalance());
                   break;
	            }
	            case 3:
	            	System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
	            	double accountNumber=scanner.nextDouble();
	            	System.out.println("ENTER THE AMOUNT YOU NEED TO DEPOSIT : ");
	            	long amount=scanner.nextLong();
	            	bank=bankService.depositMoney(accountNumber,amount);
	            	System.out.println("Your Account was credited with Rs."+amount);
	            	System.out.println("Your Account new account balance of Rs."+bank.getBalance());
                   break;
//                   1078446.0136515994
               case 4:
            		System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
	            	double accNumber=scanner.nextDouble();
	            	System.out.println("ENTER THE AMOUNT YOU NEED TO withdraw : ");
	            	long amnt=scanner.nextLong();
	            	bank=bankService.withdrawMoney(accNumber,amnt);
	            	System.out.println("Your Account was debited with Rs."+bank.getAcNo());
	            	System.out.println("Your Account new account balance of Rs."+bank.getBalance());
                   break;
               case 5:
                     
                   break;
               case 6:
                    
                   break;
               case 7:
            	   System.out.println("Thank you for using our services");
            	   scanner.close();
                   System.exit(0);
                   break;
               default: 
                   System.out.println("You must enter the valid option ( i.e. between one and seven )");
                   break;
	            }
		 }
	}
	
}
