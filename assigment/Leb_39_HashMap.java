//o Create a HashMap to store and retrieve key-value pairs.

package com.assigment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Leb_39_HashMap {

	public static void main(String[] args) 
	{
		HashMap k=new HashMap();
		System.out.println(k.size());
		System.out.println(k);
		k.put(1, "rohan");
		k.put("rohan", 1);
		k.put("jagdish", "dave");
		k.put("lashan", "limbu");
		System.out.println(k.size());
		System.out.println(k);
		k.put(1, "subh");
		System.out.println(k.size());
		System.out.println(k);
		k.remove("lashan");
		System.out.println(k.size());
		System.out.println(k);
		
		Set set=k.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
				System.out.println(i.next());
		}
			
//			String[] s=i.next().toString().split("=");
//			System.out.println("key:"+s[0]);
//			System.out.println("value:"+s[1]);
//			System.out.println();
		}
	}


