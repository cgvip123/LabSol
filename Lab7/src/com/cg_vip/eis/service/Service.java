package com.cg_vip.eis.service;

import java.util.Map;

import com.cg_vip.eis.bean.Employee;

public class Service implements EmployeeInterface
{
	@Override
	public void setDetails(Employee e,int id, String name, double salary, String designation) 
	{
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDesignation(designation);
	}

	@Override
	public void insurance(Employee e,double salary, String designation)
	{
		if((salary >5000 && salary<20000) && designation.equals("System Associate"))
		{
			e.setInsuaranceScheme("Scheme C");
		}
		else if((salary >=20000 && salary<40000) && designation.equals("Programmer"))
		{
			e.setInsuaranceScheme("Scheme B");
		}
		else if(salary >40000 && designation.equals("Manager"))
		{
			e.setInsuaranceScheme("Scheme A");
		}
		else if(salary<5000 && designation.equals("Clerk"))
		{
			e.setInsuaranceScheme("No Scheme");
		}
		else
			e.setInsuaranceScheme("No Criteria");
		}
	
	@Override
	public void insuranceSearch(Map<Integer,Employee> m,String s) 
	{
		for(Employee e : m.values())
		{
			if(e.getInsuaranceScheme().equals(s))
			{
				System.out.println(e);
			}
		}
	}
	
	@Override
	public void printDetails(Employee e)
	{
		System.out.println(e);
	}
}
