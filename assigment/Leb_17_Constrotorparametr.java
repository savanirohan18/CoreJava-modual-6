//o Write a program to create and initialize an object using a parameterized constructor.

package com.assigment;

class constpara
{
	int a,b,c;
	public constpara(int a)
	{
		System.out.println(a*a);
	}

	public constpara(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public constpara(int a,int b,int c)
	{
		System.out.println(a*b+c);
	}
}
public class Leb_17_Constrotorparametr {

	public static void main(String[] args) 
	{
		constpara ob=new constpara(3);
		new constpara(5,4);
		new constpara(4,5,6);
		
	}

}
