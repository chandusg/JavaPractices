package com.javapractice.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		
		String str="Java is platform independent and Java is nice and Java is good";
		
		Map<String,Integer>storeMap= new HashMap<String, Integer>();
		
		String names[]= str.split(" ");
		
		for (String name : names) {
			
			Integer count=storeMap.get(name);
			
			if(count == null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);
			}
			
		}
		
		
		
		Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
		
		for (Entry<String, Integer> element : entrySet) {
			
		if(element.getValue()>1)
		{
			System.out.println("The duplicate Element is " +element.getKey()+ " The number of instance is " +element.getValue());
		}
			
		}
		
		
		
		

	}
}
