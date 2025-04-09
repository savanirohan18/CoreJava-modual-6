//o Write a program to find the maximum of three numbers using a method

package com.assigment;

import java.util.Scanner;

class max
{
	
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	
	
	public void maxValue()
	{
	
		System.out.println("enter the a,b,c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
				System.out.println("a is max:"+a);
			else
				System.out.println("c is max:"+c);
		}
		else if(b>c)
			System.out.println("b is max:"+b);
		else
			System.out.println("c is max:"+c);
	}
	
}
public class Leb11_Maxnumusingmethod {

	public static void main(String[] args) 
	{
		max ob=new max();
		ob.maxValue();
	}

}
