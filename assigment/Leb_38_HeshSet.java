//o Implement a program using HashSet to remove duplicate elements from a list.

package com.assigment;

import java.util.HashSet;
import java.util.Iterator;

public class Leb_38_HeshSet {

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		System.out.println(h.size());
		System.out.println(h);
		h.add('r');
		h.add("rohan");
		h.add(123);
		h.add('r');
		h.add(34.56f);
		h.add(new Integer(345));
		h.add("rohan");
		System.out.println(h.size());
		System.out.println(h);
		h.remove("rohan");
		System.out.println(h.size());
		System.out.println(h);
		h.remove('r');
		System.out.println(h.size());
		System.out.println(h);
		
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
