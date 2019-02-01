package com.cg.Lab3;



public abstract class Account 
{
	static long no;
	private long accNum;
	private double balance;
	private Person accholder;
	
	public abstract void withdraw(double a);
	
	public void deposit(double a)
	{
		balance+=a;
	}
	
	
	public abstract Person getAccholder();
	public abstract void setAccholder(Person accholder);

	public abstract long getAccNum();
	public abstract double getBalance();
	public abstract void setBalance(double balance);
	
}
