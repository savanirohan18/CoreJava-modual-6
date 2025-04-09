//o Write a program to perform matrix addition and subtraction using 2D arrays.

package com.assigment;

import java.util.Scanner;

public class Leb_19_Arrayaddsub2d {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row:");
		int row=sc.nextInt();
		System.out.println("enter the column:");
		int column=sc.nextInt();
		int[][] a=new int[row][column];
		int[][] b=new int[row][column];
		int[][] c=new int[row][column];
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("enter the element:["+i+"]["+j+"]");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("enter the element:["+i+"]["+j+"]");
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
//		for(int i=0;i<row;i++) 
//		{
//			for(int j=0;j<column;j++)
//			{
//				c[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		
//		
//		for(int i=0;i<row;i++) 
//		{
//			for(int j=0;j<column;j++)
//			{
//				System.out.print(c[i][j]);
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
	}

}
