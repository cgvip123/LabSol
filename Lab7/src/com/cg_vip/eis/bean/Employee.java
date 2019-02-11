package com.cg_vip.eis.bean;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuaranceScheme;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public String getDesignation() 
	{
		return designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	
	public String getInsuaranceScheme() 
	{
		return insuaranceScheme;
	}
	
	public void setInsuaranceScheme(String insuaranceScheme)
	{
		this.insuaranceScheme = insuaranceScheme;
	}
	
	@Override
	public int compareTo(Employee e)
	{
		return (int)this.getSalary()-(int)e.getSalary();
		
	}
		
	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + ", insuaranceScheme=" + insuaranceScheme + "]";
	}
	
}
