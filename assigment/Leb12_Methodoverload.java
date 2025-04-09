//o Implement method overloading by creating methods for different data types.

package com.assigment;


class Overload
{
	int a,b;
	public Overload()
	{
		a=200;b=100;
		
		System.out.println(a+b);
	}
	
	public  Overload(int x)
	{
		a=x;
		b=x;
		
		System.out.println(a*b);
	}
	
	public  Overload(int x,int y)
	{
		a=x;
		b=y;
		
		System.out.println(a-b);
	}
	
	public  Overload(float a,float b)
	{
	
		System.out.println(a-b);
	
	}
}
public class Leb12_Methodoverload {

	public static void main(String[] args) 
	{
		Overload ob=new Overload();
		new Overload(20);
		new Overload(20,10);
		new Overload(40f,10f);
		
		
	}

}

