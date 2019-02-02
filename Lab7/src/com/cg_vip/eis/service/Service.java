package com.cg_vip.eis.service;

import java.util.HashMap;
import java.util.Map;

import com.cg_vip.eis.bean.Employee;
import com.cg_vip.eis.service.EmployeeInterface;

public class Service implements EmployeeInterface
{
	Map<Integer,Employee> m = new HashMap<>();
	
	
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
	   e.setInsuaranceScheme(e.getInsuaranceScheme(salary, designation));
	 
	}
	
	@Override
	public void printDetails(Employee e)
	{
		System.out.println(e);
	}
}
