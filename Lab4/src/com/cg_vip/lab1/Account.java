package com.cg_vip.lab1;

public class Account 
{
	static long no = 1;
	Account()
	{
		no += 1;
		
	}
	
	private long accNum = no;
	private double balance=500;
	private Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double a)
	{
		balance+=a;
	}
	
	public void withdraw(double a)
	{
		if((balance-a)<500)
		{
			System.out.println("Insufficient Balance");
		}
		else
			balance-=a;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	

}
