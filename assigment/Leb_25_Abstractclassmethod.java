//o Create an abstract class and implement its methods in a subclass.

package com.assigment;

abstract class emp
{
	int id;
	String name,departmant;
	public abstract void getData();
	
	
}

class empinfo extends emp
{
	@Override
	public void getData()
	{
		id=101;
		name="rohan";
		departmant="It";
	}
	
	public void dispLAY()
	
	{
		System.out.println("Id:"+id);
		System.out.println("name:"+name);
		System.out.println("departmant:"+departmant);
	}
}
public class Leb_25_Abstractclassmethod {

	public static void main(String[] args) 
	{
		empinfo ob=new empinfo();
		ob.getData();
		ob.dispLAY();
	}

}
