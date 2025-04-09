//o Create a calculator using arithmetic and relational operators.

package com.assigment;

public class Leb3_CalculatorOP 
{
	public static void main(String[] args)
	{
		int num1=500,num2=200;
		//arithmatic op
		System.out.println("addition:"+(num1+num2));
		System.out.println("subtraction:"+(num1-num2));
		System.out.println("multiplication:"+(num1*num2));
		System.out.println("divide:"+(num1/num2));
		System.out.println("modual:"+(num1%num2));
		
		
		//relational op
		System.out.println("greterthen:"+(num1>num2));
		System.out.println("lessthen:"+(num1<num2));
		System.out.println("greterthen equal:"+(num1>=num2));
		System.out.println("lessthen equal:"+(num1<=num2));
		System.out.println("double equal"+(num1==num2));
		System.out.println("notdoublr equal"+(num1!=num2));
		
		
		
		
	}
}
