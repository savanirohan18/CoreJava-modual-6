//o Create a class with static variables and methods to demonstrate their use.

package com.assigment;


class Car
{
	static String cname;
	static String company;
	public static void setData()
	{
		cname="nexon";
		company="tata";
	}
	public void displayData()
	{
		System.out.println("car name:"+cname);
		System.out.println("car company:"+company);
	}
}

public class Leb_13_Staticvariable_method {

	public static void main(String[] args) 
	{
		Car ob=new Car();
		ob.setData();
		ob.displayData();
	}

}
