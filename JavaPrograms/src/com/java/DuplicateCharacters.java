package com.java;

public class DuplicateCharacters 
{
	//Write a Java Program to find the duplicate characters in a string.
	//Test String
	
	public static void main(String[] args) 
	{
		String str = "habeeba";
		char[] chars = str.toCharArray();
		int count = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(chars[i]==chars[j])
				{
					System.out.println("Duplicate char is : "+chars[j]);
					count++;
					break;
				}
			}
		}
		
				
		
		
		
		

	}

}
