//o Demonstrate the use of different access modifiers within the same package and
//across different packages.

package com.pkAa1;

public class simple 
{
	public int id;
	private int age;
	protected String name;
	String address;
	
	public void set(int id)
	{
		this.id=id;
	}
	private void set1(int age)
	{
		this.age=age;
	}
	protected void set2(String name)
	{
		this.name=name;
	}
	void set3(String address)
	{
		this.address=address;
	}
	
	public void print()
	{
		System.out.println("id:"+id);
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		System.out.println("address:"+address);
	}

}
