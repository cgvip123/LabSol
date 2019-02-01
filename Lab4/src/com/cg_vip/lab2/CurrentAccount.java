package com.cg_vip.lab2;

public class CurrentAccount extends Account
{
	final long overdraftLimit = 10000;
	static long drawnAmount=0;
	
	@Override
	public void withdraw(double a)
	{
		
		if(drawnAmount>=10000)
		{
			System.out.println("Limit Exceed");
		}
		else
		{
			setBalance(this.getBalance()-a);
			drawnAmount+=a;
		}
	}
}