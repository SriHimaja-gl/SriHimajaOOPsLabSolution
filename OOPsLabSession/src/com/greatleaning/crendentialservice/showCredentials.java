package com.greatleaning.crendentialservice;

public class showCredentials 
{
	public static void showcredentials(String fname,String Email, char[] Password)
	{
		System.out.println("Dear "+fname+ "your generated credentials are as follows");
		System.out.println("Email   --->  "+Email);
		System.out.println("Password   --->  "+ Password);
	}
}
