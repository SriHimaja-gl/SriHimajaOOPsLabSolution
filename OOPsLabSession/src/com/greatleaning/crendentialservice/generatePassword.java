package com.greatleaning.crendentialservice;
import java.util.Random;

public class generatePassword 
{
	public static char[] Password()
	{
		int length = 10;
		String symbol = "!@#$$%^&*()";
		String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter = "abcdefghijklmnopqrstvwxyz";
		String Number = "0123456789";
		String finalPassword = symbol+capLetter+smallLetter+Number;
		Random rand = new Random();
		char[] password = new char[length];
		
		for (int i =0; i<length; i++)
		{
			password[i] = finalPassword.charAt(rand.nextInt(finalPassword.length()));
		}
		return password;
	}
}
