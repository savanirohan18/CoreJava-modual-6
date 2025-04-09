//o Write a program that demonstrates the use of an ArrayList and LinkedList.


package com.assigment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Leb_37_ArrayLinklist {

	public static void main(String[] args) 
	{
		System.out.println("array list");
		ArrayList ob=new ArrayList();
		System.out.println(ob.size());
		System.out.println(ob);
		ob.add(123);
		ob.add("rohan");
		ob.add('r');
		ob.add(20.30f);
		ob.add(new Integer(123));
		System.out.println(ob.size());
		System.out.println(ob);
		ob.add("rohan");
		System.out.println(ob.size());
		System.out.println(ob);
		ob.remove(2);
		System.out.println(ob.size());
		System.out.println(ob);
		ob.remove("rohan");
		System.out.println(ob.size());
		System.out.println(ob);
		ob.addFirst('t');
		System.out.println(ob.size());
		System.out.println(ob);
		ob.addLast("savani");
		System.out.println(ob.size());
		System.out.println(ob);
		
		Iterator i=ob.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("link list");
		LinkedList l=new LinkedList();
		System.out.println(l.size());
		System.out.println(l);
		l.add(123);
		l.add("rohan");
		l.add(45.77f);
		l.add('e');
		l.add(new Integer(234));
		System.out.println(l.size());
		System.out.println(l);
		l.remove(0);
		System.out.println(l.size());
		System.out.println(l);
		l.addFirst("hello");
		l.addLast("savani");
		System.out.println(l.size());
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		System.out.println(l.size());
		System.out.println(l);
		
		Iterator z=l.iterator();
		while(z.hasNext())
		{
			System.out.println(z.next());
		}
	}
	
	

	}


