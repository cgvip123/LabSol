package com.cg_vip.lab1;

public class Main 
{

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setName("smith");
		
		Person p2 = new Person();
		p2.setName("kathy");
		
		Account smith = new Account();
		smith.setAccHolder(p1);
		smith.setBalance(2000);
		
		Account kathy = new Account();
		kathy.setAccHolder(p2);
		kathy.setBalance(3000);
		
		smith.deposit(2000);
		System.out.println(smith.getBalance());
		
		kathy.withdraw(2000);
		System.out.println(kathy.getBalance());
		
		System.out.println(smith);
		System.out.println(kathy);
		
	}

}
