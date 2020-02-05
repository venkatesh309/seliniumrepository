package com.icici;

public class Hdfc implements Rbi

{

	public static void main(String[] args)
	{
		
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawl();
		
				
	}
	

	@Override
	public void withdrawl()
	{
		System.out.println("Iam Overriden withdrawl from Hdfc");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("Iam Overriden deposit from Hdfc");
		
	}

}
