//o Implement thread synchronization using synchronized blocks or methods.

package com.assigment;

class message
{
	public void display(String msg)
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class sych extends Thread
{
	message m1;
	String msg;
	public sych(String msg,message m1)
	{
		this.msg=msg;
		this.m1=m1;
	}
	
	public void run()
	{
		synchronized(m1)
		{
			m1.display(msg);
		}
		
	}
}

public class Leb_32_Sychronizedthrad {
	
		public static void main(String[] args) 
		{
			message m1=new message();
			sych ob=new sych("hello",m1);
			sych ob1=new sych("khana khake ja na",m1);
			sych ob2=new sych("how are you",m1);
			
			ob.start();
			ob1.start();
			ob2.start();
		}

	}


