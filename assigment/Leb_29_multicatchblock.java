//o Implement multiple catch blocks for different types of exceptions.

package com.assigment;

public class Leb_29_multicatchblock 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=10,b=5,c;
			c=a/b;
			System.out.println(c);
			
			int[] arr={3,4,5,6};
			System.out.println(arr[6]);
			
			String s=null;
			System.out.println(s.toUpperCase());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmatic Exeception");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array is out of bound");
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("string is null");
			e.printStackTrace();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}
