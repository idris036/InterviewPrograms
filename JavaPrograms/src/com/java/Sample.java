package com.java;

import java.util.HashMap;

public class Sample {
	
	public static void main(String[] args) {
		
		String str = "Hello How Are You Hello How Are You";
		String[] split = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<split.length-1; i++)
		{
			if(map.containsKey(split[i]))
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
