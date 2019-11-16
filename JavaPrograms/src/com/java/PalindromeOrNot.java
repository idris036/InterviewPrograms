package com.java;

import java.util.Scanner;

public class PalindromeOrNot {
	
	//Write a Java Program to find whether a string or number is palindrome or not.

	public static void main(String[] args) 
	{
		String original, reverse = "";
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String or Number : ");
		
		original = scn.next();
		System.out.println("Length is "+original.length());
		
		for(int i=original.length()-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("Reverse String is : "+reverse);
		
		if(original.equalsIgnoreCase(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
