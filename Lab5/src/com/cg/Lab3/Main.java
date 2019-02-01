package com.cg.Lab3;

public class Main
{
	public static void main(String[] args) 
	{
		Person smith = new Person();
		smith.setName("smith");
		
		Person kathy = new Person();
		kathy.setName("kathy");

		smith.setAccholder(smith);
		smith.setBalance(2000);
		
		kathy.setAccholder(kathy);
		kathy.setBalance(3000);
		
		smith.deposit(2000);
		System.out.println(smith.getBalance());
		
		kathy.withdraw(2000);
		System.out.println(kathy.getBalance());
		
		System.out.println(smith);
		System.out.println(kathy);
		
	}

}
