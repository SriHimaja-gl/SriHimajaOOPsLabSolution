package com.greatlearning.model;

public class Employee 
{
	String lastName;
	String firstName;
	
	public void employee(String lastName, String firstName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public void setlastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public void setfirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getfirstName()
	{
		return firstName;
	}
}
