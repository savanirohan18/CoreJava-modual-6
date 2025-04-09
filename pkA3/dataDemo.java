//o Create a user-defined package and import it into another program.

package com.pkA3;

import java.util.Scanner;

import com.pkA1.data;

public class dataDemo {

	public static void main(String[] args) 
	{
		int n1,n2;
		String n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id:");
		n1=sc.nextInt();
		System.out.println("enter the age:");
		n2=sc.nextInt();
		System.out.println("enter the name:");
		n3=sc.next();
		data ob=new data();
		ob.setData(n1, n2, n3);
		ob.deiplayData();
		
		
		int nn1,nn2;
		String nn3;
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the id:");
		nn1=sc.nextInt();
		System.out.println("enter the age:");
		nn2=sc.nextInt();
		System.out.println("enter the name:");
		nn3=sc.next();
		com.pkA2.data obj=new com.pkA2.data();
		obj.setData(nn1, nn2, nn3);
		obj.displayData();
	}

	
}
