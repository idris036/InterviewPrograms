package com.java;

import java.util.Scanner;

public class Swap2NumbersWithoutThirdVar {
	
	//Write a Java Program to swap two numbers without using the third variable.

	public static void main(String[] args) {
		
		int x, y;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value of x = ");
		x = scn.nextInt();
		
		
		System.out.print("Enter the value of y = ");
		y = scn.nextInt();
		System.out.println();
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("Value of x is = "+x);
		System.out.println("value of y is = "+y);

	}

}
