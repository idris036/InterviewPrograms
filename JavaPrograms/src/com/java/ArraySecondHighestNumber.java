package com.java;

public class ArraySecondHighestNumber {

	//Write a Java Program to find the second highest number in an array.
	
	public static void main(String[] args) 
	{
		int arr[] = {14, 46, 47, 94, 94, 52, 86, 36, 94, 89, 90 };
		
		int largest = arr[0];
		int secondlargest = arr[0];
		
		System.out.println("The given array is: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				secondlargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondlargest && arr[i] != largest)
			{
				secondlargest = arr[i];
			}
		}
		System.out.println("\nSecond largest number is: "+secondlargest);		
	}
}
