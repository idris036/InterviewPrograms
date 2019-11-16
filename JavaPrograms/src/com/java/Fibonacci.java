package com.java;

import java.util.Scanner;

public class Fibonacci {
	
	//Write a Java Program for Fibonacci series.

	public static void main(String[] args) {
		
		int f,f1=0, f2 = 1;
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scn.nextInt();
		
		for(int i=0; i<num; i++)
		{
			if(i<=1)
			{
				f=i;
			}
			else
			{
				f=f1+f2;
				f1=f2;
				f2=f;
			}
			System.out.println(f);
		}
	}

}
