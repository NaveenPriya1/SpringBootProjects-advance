package com.advance.Exception;

import java.util.Scanner;

public class BankAccount {

	private int accNo;
	private String cusName;
	private String accType;
	private float balance;
	
	
	
	public BankAccount() {
		super();
	}
	
	

	public BankAccount(int accNo, String cusName, String accType, float balance) {
		super();
		this.accNo = accNo;
		this.cusName = cusName;
		this.accType = accType;
		this.balance = balance;
	}



	public void deposit(float amount) {
		if(amount>0) {
		balance+=amount;
		System.out.println("deposit amount "+amount+" successfull");
//		Scanner sc = new Scanner(System.in);
		System.out.println("your account balance is "+balance);
		}else
			throw new NegitiveAmount("Amount can't be negitive");
		
		if(accType.equalsIgnoreCase("Savings") && balance<1000){
			throw new LowBalanceException();
		}
		if(accType.equalsIgnoreCase("Current") && balance<5000){
			throw new LowBalanceException();
		}
	}
	
	public void withdraw(float amount) {
		
		if(amount>balance) {
			throw new InsufficientFunds();
		}else if(amount<0) {
			throw new NegitiveAmount("Amount can't be negitive");
		}else {
			if(accType.equalsIgnoreCase("Savings") && balance>=1000) {
				if((balance-=amount)>=1000){
					System.out.println("withdrawn succesful amount ="+amount);
					System.out.println("Remaining balance = "+balance);
				}else {
					throw new InsufficientFunds();
				}
				
			}
			
			if(accType.equalsIgnoreCase("Current") && balance>=5000) {
				if((balance-=amount)>=5000){
					System.out.println("withdrawn succesful amount ="+amount);
					System.out.println("Remaining balance = "+balance);
				}else {
					throw new InsufficientFunds();
				}
				
			}
		}
		
		
	}
	
	public float getBalance() {
		System.out.println("Your balance is "+balance);
//		if(balance<0)
			
		if(accType.equalsIgnoreCase("Savings") && balance<1000){
			throw new LowBalanceException();
		}
		if(accType.equalsIgnoreCase("Current") && balance<5000){
			throw new LowBalanceException();
		}
		return balance;
	}
}
