package com.cg_vip.eis.service;

import java.util.Comparator;

import com.cg_vip.eis.bean.Employee;

public class Compare implements Comparator<Employee>
{
	public int compare(Employee o1,Employee o2) 
	{
		 return (int)o1.getSalary()-(int)o2.getSalary();
		
	}
}
	


	