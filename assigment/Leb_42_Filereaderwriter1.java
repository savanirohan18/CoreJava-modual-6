package com.assigment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Leb_42_Filereaderwriter1
{
		public static void main(String[] args) 
		{
			try {
				FileReader reader =new FileReader("Ass42.txt");
				FileWriter writer =new FileWriter("output42.txt");
				
				int character;
				while((character = reader.read())!= -1)
				{
					writer.write(character);
//					System.out.print((char)character);
				}
				writer.close();
				reader.close();
				System.out.println("File has been copied Succesfully...");
			} 
			catch (Exception e)
			{
				{
					System.out.println("an error occured : "+e.getMessage());
				}
				e.printStackTrace();
			}
		}

	}

