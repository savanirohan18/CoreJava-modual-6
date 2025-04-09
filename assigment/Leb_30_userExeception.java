//o Create a custom exception class and use it in your program.

package com.assigment;

class ageException extends RuntimeException
{
	public ageException(String msg)
	{
		super(msg);
	}
}
public class Leb_30_userExeception {

	public static void main(String[] args)// throws ageException 
	{
		int age=17;
		if(age<18)
		{
			throw new ageException("age is greter then 18");
		}
		else
		{
			System.out.println("age small");
		}
	}

}
