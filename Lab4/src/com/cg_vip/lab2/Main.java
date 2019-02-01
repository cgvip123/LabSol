package com.cg_vip.lab2;

public class Main 
{

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setName("smith");
		
		Person p2 = new Person();
		p2.setName("kathy");
		
		Account smith = new SavingAccount();
		smith.setActype("SavingAccount");
		smith.setAccHolder(p1);
		smith.setBalance(2000);
		
		Account kathy = new CurrentAccount();
		kathy.setActype("CurrentAccount");
		kathy.setAccHolder(p2);
		kathy.setBalance(3000);
		
		smith.withdraw(2000);
		kathy.withdraw(2000);
		kathy.withdraw(2000);
		kathy.withdraw(2000);
		kathy.withdraw(2000);
		kathy.withdraw(2000);
		kathy.withdraw(2000);
		
		System.out.println(smith);
		System.out.println(kathy);
		
	}

}
