//o Write a program to display the Fibonacci series using a loop.

package com.assigment;

public class Leb_7_Febonacci {

	public static void main(String[] args)
	{
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<5;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
		
	}

}
