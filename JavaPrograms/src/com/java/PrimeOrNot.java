package com.java;

import java.util.Scanner;

public class PrimeOrNot {
	
	//Write a Java Program to find whether a number is prime or not.

	public static void main(String[] args) 
	{	
		int num, ref=1;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number to see if Prime or Not : ");
		num = scn.nextInt();
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				ref=0;
				System.out.println("Not Prime");
				break;
			}
		}
		if(ref==1)
		{
			System.out.println("Number "+num+" is Prime");
		}		
	}
}
