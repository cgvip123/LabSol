package com.cg_vip.lab1;
import com.cg_vip.lab1.MethodOp;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter option");
			System.out.println("1. Add String");
			System.out.println("2. Replace odd positions with #");
			System.out.println("3. Remove duplicate characters in the String");
			System.out.println("4. Change odd characters to upper case");
			System.out.println("5. Exit");
			
			int a = sc.nextInt();
			
			switch(a)
			{
				case 1 : MethodOp o = new MethodOp();
						 System.out.println(o.add());
						 break;
				
				case 2 : MethodOp o1 = new MethodOp();
						 System.out.println(o1.replace());
					     break;
				         
				case 3 : MethodOp o2 = new MethodOp();
						 System.out.println(o2.rem_Duplicates());
			     		 break;
				
				case 4 : MethodOp o3 = new MethodOp();
						 System.out.println(o3.repUpper());
			     		 break;
				case 5: System.exit(0);
						break;
			}
			
		
		}

	}
}

