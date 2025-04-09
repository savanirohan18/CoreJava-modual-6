package com.assigment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Leb_34_fileredarwriter {

	public static void main(String[] args) 
	{
		try {
			FileWriter fw=new FileWriter("ass.txt");
			String s="this is tops tecno";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("write");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr=new FileReader("ass.txt");
			int x;
			while((x=fr.read()) !=-1)
			{
				System.out.print((char)x);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
