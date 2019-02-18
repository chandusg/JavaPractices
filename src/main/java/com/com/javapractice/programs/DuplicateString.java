package com.com.javapractice.programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		
		String string= "Java and Java and Java and Colurful";
		
		String[] names=string.split(" ");
		
		
		Map<String,Integer> storeMap= new HashMap<String,Integer>();
		
		for (String name : names) {
			
			Integer count=storeMap.get(name);
			if(count==null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);
			}
			
		}
		
		
		

	}

}
