package com.cg_vip.lab4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer> m = new HashMap<>();
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int j=0;j<n;j++)
		{
			a[j]=sc.nextInt();
		}
		MapArray c= new MapArray();
		m = c.square(a);
		System.out.println(m); 
	}

}
