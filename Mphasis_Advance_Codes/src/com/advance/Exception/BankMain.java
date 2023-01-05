package com.advance.Exception;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BankAccount acc1= new BankAccount(2233445,"Naveen Priya","Current",5001);
      
//      acc1.deposit(5000);
//      acc1.withdraw(140);
//      acc1.withdraw(13000);
//      acc1.withdraw(500);
    
      acc1.getBalance();
      acc1.withdraw(1);
      acc1.withdraw(1);
	}

}
