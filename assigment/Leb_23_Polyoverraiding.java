//o Implement runtime polymorphism by overriding methods in the child class.

package com.assigment;

class First
{
	int id;
	String name;
	
	public void set()
	{
		id=1;
		name="ram";
	}
	public void get()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}
class Second extends First
{
	int id1;
	String name1;
	
	public void set()
	{
		id1=2;
		name1="sayam";
	}
	public void get()
	{
		System.out.println(id1);
		System.out.println(name1);
	}
}

public class Leb_23_Polyoverraiding {

	public static void main(String[] args)
	{
//		First ob=new Second();
//		ob.set();
//		ob.get();
//		
//		ob=new First();
//		ob.set();
//		ob.get();
		
		
		First ob=new First();
		ob.set();
		ob.get();
		
		ob=new Second();
		ob.set();
		ob.get();
		
		
	}

}
