//o Create a user-defined package and import it into another program.

package com.pkA2;

public class data 
{
	int id,age;
	String name;
	public void setData(int id,int age,String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	public void displayData()
	{
		System.out.println("id:"+id);
		System.out.println("age:"+age);
		System.out.println("name:"+name);
	}
}
