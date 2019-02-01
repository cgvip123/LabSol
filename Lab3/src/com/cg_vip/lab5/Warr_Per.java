package com.cg_vip.lab5;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Warr_Per
{
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int year = s.nextInt();
		LocalDate manDate = LocalDate.of(year,Month.valueOf(s1.toUpperCase()),1);
		System.out.println("Enter expiry month and year");
		int expMon = s.nextInt();
		int expYear= s.nextInt();
		LocalDate p;
		p = manDate.plusMonths(expMon);
		p = p.plusYears(expYear);
		
		System.out.println(p);
		s.close();
	}
}
