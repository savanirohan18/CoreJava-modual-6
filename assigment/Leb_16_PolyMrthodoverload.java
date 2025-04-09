//o Implement method overriding to show polymorphism in action.

package com.assigment;

import java.util.Scanner;

class Overloding
{
	float pi=3.14f;
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		int r=sc.nextInt();
		
		System.out.println(pi*r*r);//circle formula
		
	}
	
	public void area(float b,float h)
	{	
		System.out.println(b*h/2);//triangle formula
	}
	
	public void area(int l,int w)
	{	

		System.out.println(l*w);//rect formula
	}
	
	public void area(int a)
	{
		System.out.println(a*a*a);//cube formula
	}
	
	public void area (double a,double b,double h) 
	{
		double ans =0.5*(a+b)*h;//trapezoid formula
		System.out.println(ans);
	}
}

public class Leb_16_PolyMrthodoverload {

	public static void main(String[] args)
	{
		{
			Overloding ob=new Overloding();
			ob.area();
			ob.area(9f, 5f);
			ob.area(5, 6);
			ob.area(4);
			ob.area(4,5,6);
		}
	}

}
