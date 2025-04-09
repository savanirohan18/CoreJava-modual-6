package com.assigment;

class abc extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("loop start"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("loop end");
	}
}
public class Leb_31_MultipleThreadclass {

	public static void main(String[] args) 
	{
		abc ob=new abc();
		
		ob.start();
		
		for(int i=0;i<3;i++)
		{
			System.out.println("main loop start"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main loop end");
	}

}
