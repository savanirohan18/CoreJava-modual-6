//o Write a program to demonstrate exception handling using try-catch-finally.

package com.assigment;

class T implements Runnable{
	
}
public class Leb_28_TRYCatchFinallyDemo {

	public static void main(String[] args) 
	{
		try
		{
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
			
		}
		catch (Exception e) 
		{
				System.out.println(e);
				
				e.printStackTrace();
		}
		
		finally 
		{
			System.out.println("thankyou");
		}
	}

}
