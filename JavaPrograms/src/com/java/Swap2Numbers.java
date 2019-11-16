package com.java;

import java.util.Scanner;

public class Swap2Numbers {
	
	//Write a Java Program to swap two numbers with using the third variable.
	
	public static void main(String[] args) {
		
		int x, y , temp;
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value of x = ");
		x = scn.nextInt();
		
		System.out.println();
		
		System.out.print("Enter the value of y = ");
		y = scn.nextInt();
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("value of x is "+x+" and value of y is "+y);
	
	}

}
