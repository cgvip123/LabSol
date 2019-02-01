package com.cg_vip.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class StringPosNeg
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String a ="";
		a=s.next();
		String b = a.toLowerCase();
		char c[] = b.toCharArray();
		
		Arrays.sort(c);
		String e = c.toString();
		
		if(b.equals(e))
		{
			System.out.println("Positive");
		}
		else
			System.out.println("Negative");
		s.close();
	}
}
