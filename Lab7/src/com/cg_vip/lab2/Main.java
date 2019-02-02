package com.cg_vip.lab2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
	
		stringCollection s = new stringCollection();
		System.out.println(s.operations(s1, s2));

	}

}
