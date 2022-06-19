package com.greatlearning.service;

import java.util.Scanner;

import com.greatleaning.crendentialservice.generateEmailAddress;
import com.greatleaning.crendentialservice.generatePassword;
import com.greatleaning.crendentialservice.showCredentials;
import com.greatlearning.model.Employee;

public class DriverClass 
{
	public static void main(String[] args)
	{
		String lname;
		String fname;
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name of the employee");
		fname = sc.next();
		emp.setfirstName(fname);
		System.out.println("First Name is "+emp.getfirstName());
		
		System.out.println("Enter the last name of the employee");
		lname = sc.next();
		emp.setlastName(lname);
		System.out.println("Last Name is "+emp.getlastName());
		
		int Option;
		String Email;
		
		do {
		System.out.println("Please enter any number");
		System.out.println("Option 0: Technical");
		System.out.println("Option 1: Admin");
		System.out.println("Option 2: Human Resource");
		System.out.println("Option 3: Legal");
		Option = sc.nextInt();
		switch(Option)
		{
		case 0: 
			Email=generateEmailAddress.dep(fname,lname,"tech");
			showCredentials.showcredentials(fname, Email, generatePassword.Password());
			break;
		case 1: 
			Email=generateEmailAddress.dep(fname,lname,"admin");
			showCredentials.showcredentials(fname, Email, generatePassword.Password());
			break;	
		case 2: 
			Email=generateEmailAddress.dep(fname,lname,"hr");
			showCredentials.showcredentials(fname, Email, generatePassword.Password());
			break;
		case 3: 
			Email=generateEmailAddress.dep(fname,lname,"legal");
			showCredentials.showcredentials(fname, Email, generatePassword.Password());
			break;
		default: System.out.println("Please enter the correct number");
		break;
		}
		}while(Option!= 4);
		sc.close();
		
	}
}
