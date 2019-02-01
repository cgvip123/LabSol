package com.cg.Lab3;

public class Person extends Account
{
	static long no = 1;
	Person()
	{
		no+=1;
	}
	
	private long accNum=no;
	private double balance=500;
	private Person accholder;
	
	private float age;
	
	private String name;
	
	
	public float getAge() {
		return age;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person getAccholder() {
		return accholder;
	}
	public void setAccholder(Person accholder) {
		this.accholder = accholder;
	}
	@Override
	public void withdraw(double a)
	{
		if((getBalance()-a)<500)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			balance-=a;
		}
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accholder.getName() + "]";
	}
}
