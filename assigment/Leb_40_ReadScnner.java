package com.assigment;

import java.util.Scanner;

public class Leb_40_ReadScnner {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name :- ");
		String name=sc.nextLine();
		
		System.out.println("Enter your age :- ");
		int age=sc.nextInt();
		
		System.out.println("my name is"+ name +"my age is"+ age +"old");
	}

}
