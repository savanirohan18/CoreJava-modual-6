//o Create a class Student with attributes (name, age) and a method to display the
//details.

package com.assigment;

class Intro
{
	String name;
	int age;
	public void setData(String sname,int sage)
	{
		name=sname;
		age=sage;
	}
	public void displayData()
	{
		System.out.println(name);
		System.out.println(age);
	}
}
public class Leb_8_ClassObject {

	public static void main(String[] args)
	{
		Intro ob=new Intro();
		ob.setData("rudra", 20);
		ob.displayData();
	}

}
