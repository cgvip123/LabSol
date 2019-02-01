package com.cg_vip.cg.eis.service;

import com.cg_vip.cg.eis.bean.Employee;

public class Service implements EmployeeInterface
{
	Employee e;
	@Override
	public Employee setDetails(int id, String name, double salary, String designation) 
	{
		e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDesignation(designation);
		return e;
	}

	@Override
	public void insurance(double salary, String designation)
	{
	   e.setInsuaranceScheme(e.getInsuaranceScheme(salary, designation));
	}
	
	@Override
	public void printDetails()
	{
		System.out.println(e);
	}
}
