package com.java;

import java.util.HashMap;

public class HashMapCountWords {
	
	//Write a Java Program to count the number of words in a string using HashMap.
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String str = "Hello How Are You Hello How Are You";

		String[] split = str.split(" ");

		HashMap<String,Integer> map = new HashMap<String,Integer>();

		for (int i=0; i<split.length-1; i++) 
		{
		    if (map.containsKey(split[i])) 
		    {
		        int count = map.get(split[i]);

		        map.put(split[i], count+1);
		    }
		    else
		    {
		        map.put(split[i], 1);
		    }
		}

		System.out.println(map);

		}

}
