package com.assigment;


class a
{
	public void get()
	{
		System.out.println("class a");
	}
}

class b extends a
{
	public void put()
	{
		System.out.println("class b");
	}
}
public class Leb_22_InheritanceExtends {

	public static void main(String[] args) 
	{
		
		b ob=new b();
		ob.get();
		ob.put();
		
		
	}

}
