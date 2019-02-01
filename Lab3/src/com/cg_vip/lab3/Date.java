package com.cg_vip.lab3;

import java.time.*;
import java.util.Scanner;

public class Date
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
		System.out.println(p);
		s.close();
	}
	
	
}
