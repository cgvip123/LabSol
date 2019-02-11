package com.cg_vip.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cg_vip.eis.bean.Employee;
import com.cg_vip.eis.service.Compare;
import com.cg_vip.eis.service.Service;

public class EmployeeDetails
{
	public static void main(String args[])
	{
		Map<Integer,Employee> m = new HashMap<>();
	
		Service s1 = new Service();
		
		Employee e1 = new Employee();
		s1.setDetails(e1,1,"Rahul",40001,"Manager");
		s1.insurance(e1,400001, "Manager");
		m.put(e1.getId(),e1);
	    
		Employee e4 = new Employee();
    	s1.setDetails(e4,2,"Suresh",3000,"Clerk");
		s1.insurance(e4,3000,"Clerk");
		m.put(e4.getId(),e4);
		
		Employee e3 = new Employee();
    	s1.setDetails(e3,3,"Ramesh",6000,"System Associate");
		s1.insurance(e3,6000,"System Associate");
		m.put(e3.getId(),e3);
		
		Employee e2 = new Employee();
    	s1.setDetails(e2,4,"Vipul",30000,"Programmer");
		s1.insurance(e2,30000,"Programmer");
		m.put(e2.getId(),e2);
		
		System.out.println(m);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Scheme");
     	String scheme = sc.nextLine();

     	s1.insuranceSearch(m,scheme);
		
     	System.out.println("After Removing id 2");
     	m.remove(2);
     	
     	Set<Employee> s = new TreeSet<>(m.values());
		
	//	Set<Employee> s2 = new TreeSet<>(; 
		
     	System.out.println(s);
			
	}
}
