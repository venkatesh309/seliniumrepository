package com.samplepackage;

public class ChildClass extends FirstAbstractClass

{

	public static void main(String[] args)
	{
		ChildClass c=new ChildClass();
		c.m1();
		c.m2();

	}

	/*
	 * public void m1() { System.out.println("m1 is overriden in ChildClass"); }
	 */
	public void m2()
	{
		System.out.println("m2 is overriden from ChildClass");
		
		
	}

}
