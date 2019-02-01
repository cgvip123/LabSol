package com.cg_vip.lab8;

import java.util.Arrays;
import java.util.Scanner;

public class SortString 
{
	
	String[] check(String u[])
	{
		int j=0;
		for(String s:u)
		{
			
			int n=s.length();
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				n=(n/2)+1;
			}
			s = s.toLowerCase();
			char[] v =s.toCharArray();
			Arrays.sort(v);
			String m=String.valueOf(v);
			String s1 = m.substring(0, n);
			String s2 = m.substring(n,s.length());
			
			char a[] = s1.toCharArray();
			
			
			for(int b=0;b<s1.length();b++)
			{
				a[b]= Character.toUpperCase(a[b]);
			}

			String y = String.valueOf(a)+s2;
			
			u[j]=y;
			j++;
		}
		return u;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] r= new String[n];
		String[] t = new String[n];
		for(int i=0;i<n;i++)
		{
			String s  = sc.next();
			r[i]=s;
		}
		SortString q = new SortString();
		t = q.check(r);
		for(String l : t)
		{
			System.out.println(l);
		}
		sc.close();	
		}
}
