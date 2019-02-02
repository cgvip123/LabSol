package com.cg_vip.eis.service;

import com.cg_vip.eis.bean.Employee;

public interface EmployeeInterface 
{
	public void setDetails(Employee e,int id,String name,double salary,String designaton);
	public void insurance(Employee e,double salary,String designation);
	public void printDetails(Employee e);
}

