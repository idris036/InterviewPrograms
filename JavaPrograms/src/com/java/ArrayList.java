package com.java;

import java.util.Iterator;

public class ArrayList {
	
	//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

	public static void main(String[] args) 
	{		
		java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(55);
		list.add(50);
		
		System.out.println("Using For Loop");
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println("Advanced For Loop");
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Using while loop with the help of Iterator");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
	}

}
