//o Demonstrate the use of different access modifiers within the same package and
//across different packages.

package com.pkAaa2;

import com.pkAa1.simple;

public class simpleDemo {

	public static void main(String[] args) 
	{
		simple ob=new simple();
		ob.set(101);
//		ob.set1(20);
//		ob.set2("ram");
//		ob.set3("delhi");
		ob.print();
	}
	

}
