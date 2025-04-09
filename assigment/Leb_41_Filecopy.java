package com.assigment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Leb_41_Filecopy 
{
	
		public static void main(String[] args) 
		{
			try 
			{
				FileInputStream fis=new FileInputStream("Assignment1.txt");
				FileOutputStream fos=new FileOutputStream("Assignmentcopy1.txt");

			int data;
			while((data = fis.read())!= -1)
			{
				fos.write(data);
//				System.out.print((char)data);
			}
			System.out.println("File copied Succesfully....");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

	}

