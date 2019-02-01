package com.cg_vip.lab1;

import java.util.Scanner;

public class MethodOp 
{
	Scanner sc = new Scanner(System.in);
	public String add()
	{
		System.out.println("Enter the String");
		String b = sc.next();
		String d;
		d=b+b;
		return d;
	}
	public String replace()
	{
		System.out.println("Enter the String");
		String b = sc.next();
		StringBuilder sb1 = new StringBuilder(b);
		for(int i=0;i<sb1.length();i+=2)
		{
			//char a = sb1.charAt(i);
			char a='#';
			sb1.setCharAt(i, a);
		}
		return sb1.toString();
	}
	public String rem_Duplicates()

	{
		System.out.println("Enter the String");
		String b = sc.next();
		int flag=0;
		String c="";
		c = c+b.charAt(0);
		for(int i=1;i<b.length();i++)
		{
			for(int j=0;j<c.length();j++)
			{
				if(b.charAt(i)==c.charAt(j))
				{
					flag=0;
				}
			}
			if(flag==1)
			{
				c+=b.charAt(i);
				
			}
			flag=1;
		}
		return c;
		
	}
	public String repUpper()
	{
		System.out.println("Enter the String");
		String b = sc.next();
		StringBuilder sb1 = new StringBuilder(b);
		for(int i=0;i<sb1.length();i+=2)
		{
			char a = sb1.charAt(i);
			a=Character.toUpperCase(a);
			sb1.setCharAt(i, a);
		}
		return sb1.toString();
	}
}