//o Create a program to reverse a string and check for palindromes.

package com.assigment;

import java.util.Scanner;

public class Leb_20_Stringreversplidrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		
		if(rev.equals(s))
			System.out.println("plidrome");
		else
			System.out.println("not plidrome");
	
		
	}
}
