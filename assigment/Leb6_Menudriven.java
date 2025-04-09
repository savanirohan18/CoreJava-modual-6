//o Implement a simple menu-driven program using a switch-case

package com.assigment;

import java.util.Scanner;



public class Leb6_Menudriven {

	public static void main(String[] args)
	{
		
//		do
//		{
		int a=40,b=20;
		int op;
		
		System.out.println("---------------------------");
		System.out.println("1.addition");
		System.out.println("2.sutraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.modual");
		System.out.println("6.Exit");
		System.out.println("---------------------------");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice:");
		op=sc.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("addition:"+(a+b));
			break;
			
		case 2:
			System.out.println("subtraction:"+(a-b));
			break;
		
		case 3:
			System.out.println("multiplication:"+(a*b));
			break;
		
		case 4:
			System.out.println("division:"+(a/b));
			break;
			
		case 5:
			System.out.println("modual:"+(a%b));
			break;
			
		case 6:
			System.out.println("exit the program");
			System.exit(0);
			
		}
		
		
//		System.out.println("repited for program:");
//		int ch=sc.next().charAt(0);
//			
//		}while(ch=='Y' && ch=='y');
//		
		
	}

}
