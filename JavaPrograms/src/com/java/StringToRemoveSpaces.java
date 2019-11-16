package com.java;

import java.util.regex.Pattern;

public class StringToRemoveSpaces {
	
	//Write a Java Program to remove all white spaces from a string without using replace().

	public static void main(String[] args) 
	{
		String str = "Hello this is mad world";

		Pattern p = Pattern.compile("\\s");
		String[] str1 = p.split(str);
		
		for(String str2: str1)
		{
			System.out.print(str2);
		}


	}

}
