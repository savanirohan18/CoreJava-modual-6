//o Write a program that implements multiple interfaces in a single class

package com.assigment;

class bioData implements Leb_26_Interface,Teacher,branch
{
	@Override
	public void get() 
	{
		System.out.println("branch name:"+bname);
		System.out.println("address:"+add);
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		System.out.println("course:"+course);
		System.out.println("cost:"+cost);
	}

	@Override
	public void get1() 
	{
		System.out.println("salary"+salary);
		System.out.println("fname"+fname);
		System.out.println("sub"+sub);
	}
}

public class _26_interdemo {

	public static void main(String[] args) 
	{
		bioData ob=new bioData();
		ob.get();
		ob.get1();
	}

}
