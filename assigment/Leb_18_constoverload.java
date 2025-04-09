//o Demonstrate constructor overloading by passing different types of parameters.

package com.assigment;

class Constoverload
{
	int a,b;
	public Constoverload()
	{
		a=200;b=100;
		System.out.println(a+b);
	}
	
	public Constoverload(int x)
	{
		a=x;
		b=x;
		System.out.println(a-b);
	}
	
	public Constoverload(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a*b);
	}
	
}
public class Leb_18_constoverload {

	public static void main(String[] args) 
	{
		Constoverload ob=new Constoverload();
		new Constoverload(20);
		new Constoverload(40,20);
	}

}
