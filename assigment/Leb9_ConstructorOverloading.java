//o Create multiple constructors in a class and demonstrate constructor overloading.

package com.assigment;

class Conoverload
{
	int a,b;
	public Conoverload()
	{
		a=200;b=100;
		System.out.println(a+b);
	}
	
	public Conoverload(int x)
	{
		a=x;
		b=x;
		System.out.println(a-b);
	}
	
	public Conoverload(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a*b);
	}
	
}
public class Leb9_ConstructorOverloading {

	public static void main(String[] args) 
	{
		Conoverload ob=new Conoverload();
		new Conoverload(20);
		new Conoverload(40,20);
		
	}

}
