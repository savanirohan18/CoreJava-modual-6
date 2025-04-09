package com.assigment;

class base
{
	String name;
	public void set()
	{
		name="Rohan";
	}

}

class derived extends base
{
	
	String name;
	
	public void get()
	{
		name="meru";
	}
	
	public void display()
	{
		System.out.println("derived class:"+super.name);
	}
}

public class Leb_24_SuperKeyword {

	public static void main(String[] args) 
	{
		derived ob=new derived();
		ob.set();
		ob.get();
		ob.display();
	}

}

//class Shape
//{
//	String s_name="Square";
//	public void draw()
//	{
//		System.out.println("can't say shape type");
//	}
//}
//class Square extends Shape
//{
//	@Override
//	public void draw() 
//	{
//		//super.draw();
//		System.out.println(super.s_name+" Shape ");
//	}
//}
//public class Leb_24_SuperKeyword
//{
//
//	public static void main(String[] args)
//	{
//		Square s=new Square();
//		s.draw();
//	}
//
//}

