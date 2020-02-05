package com.icici;

public class IciciClass implements Rbi

{

	public static void main(String[] args) 
	{
		IciciClass i=new IciciClass();
		i.deposit();
		i.withdrawl();
		
				

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("Iam Overriden withdrawl from Icici");
		
	}

	@Override
	public void deposit()
	{
		System.out.println("Iam Overriden deposit from Icici");
		
	}

}
