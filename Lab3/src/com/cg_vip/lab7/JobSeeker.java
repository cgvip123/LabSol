package com.cg_vip.lab7;

import java.util.Scanner;

public class JobSeeker 
{
	static String s = "_job";
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int len = s1.length();
		if(len>5)
		{
			String en = s1.substring((len- 4), len);
			if(en.equals(s))
			{
				if((s1.substring(0,(len-4)).length()==8))
				{
					
					System.out.println("true");
				}		
				else
				{
					System.out.println("false");
				}
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
			System.out.println("false");
		}
		sc.close();
	}

}
