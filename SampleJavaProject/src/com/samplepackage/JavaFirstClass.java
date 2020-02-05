package com.samplepackage;

public class JavaFirstClass
{

	int a=10,b=20,c;
	
	public void add()
	{
		c=a+b;
		System.out.println("Adition of a & b is :"+ c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("subtraction of a & b is :"+ c);
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("hello");
		JavaFirstClass	obj= new JavaFirstClass();
		obj.add();
		obj.sub();
		System.out.println(obj.c);
	}

}
