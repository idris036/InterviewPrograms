package com.java;

import java.util.Scanner;

public class StringReverseWithoutStringFunction1 {

	//Write a Java Program to reverse a string without using String inbuilt function reverse().
	
	public static void main(String[] args) {
		
		String original, reverse = "";
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String to be Reversed = ");
		original = scn.nextLine();
		
		/*int length = original.length();
		
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}*/
		
		char[] chars = original.toCharArray();
		
		for(int i=chars.length-1; i>=0; i--)
		{
			System.out.print(chars[i]);
		}
		
		
		
	//	System.out.println("Reverse String is = "+reverse);
		
	}

}
