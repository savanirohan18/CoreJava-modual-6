//o Implement a simple class with getters and setters for encapsulation.

package com.assigment;


class Student
{
	private int age;
	private String name;
	
	public void setData()
	{
		age=21;
		name="ram";
	}
	
	public void getData()
	{
		System.out.println(age);
		System.out.println(name);
	}
}
public class Leb_10_Encapsulation {

	public static void main(String[] args) 
	{
		Student ob=new Student();
		ob.setData();
		ob.getData();
	}

}
