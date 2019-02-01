package com.cg_vip.lab2;

public class SavingAccount extends Account 
{
	final long minBalance = 500;
	
	@Override
	public void withdraw(double a)
	{
	
		if((this.getBalance()-a)<500)
		{
			System.out.println("Insufficient Balance");
		}
		else
			setBalance(getBalance()-a);
	}
	

}
