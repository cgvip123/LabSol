package com.cg_vip.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reverse 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			StringBuilder sb = new StringBuilder(String.valueOf(a[j])).reverse();
			a[j]=Integer.parseInt(sb.toString());
		}
		List<Integer> l = new ArrayList<>(a.length);
		for(int h:a)
		{
			l.add(h);
		}
		Collections.sort(l)	;
		System.out.println(l);
	}
}
