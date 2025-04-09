package com.assigment;

import java.util.Scanner;

class student
{
	int id;
	String name;
	int age;
	String gread;
	int marks;//1 to 500
	Scanner sc=new Scanner(System.in);
	
	public void setData()
	{
		System.out.println("enter the id");
		id=sc.nextInt();
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the age");
		age=sc.nextInt();
	}
}

class subject extends student
{
	public void set1Data()
	{
		setData();
		System.out.println("enter the gread");
		gread=sc.next();
		System.out.println("enter the marks");
		marks=sc.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("gread:"+gread);
		System.out.println("marks:"+marks);
		
	}
}
public class Leb_14_SingleInheritance {

	public static void main(String[] args) 
	{
		subject ob=new subject();
		ob.set1Data();
		ob.displayData();
	}

}
