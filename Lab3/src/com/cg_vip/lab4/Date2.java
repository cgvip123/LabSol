package com.cg_vip.lab4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Date2 
{
		
		public static void main(String args[])
		{
			Scanner s = new Scanner(System.in);
			
			int day = s.nextInt();
			String s1 = s.next();
			int year = s.nextInt();
			LocalDate d = LocalDate.of(year,Month.valueOf(s1.toUpperCase()),day);
			Period p;
			p = d.until(LocalDate.now());
			System.out.println(Math.abs(p.getDays()));
			System.out.println(Math.abs(p.getMonths()));
			System.out.println(Math.abs(p.getYears()));
			s.close();
		}
		
		
	}


