package com.javapractice.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateDigitInNumber {

	public static void main(String[] args) {
		
			
			
			Integer num=123123123;
			
			Map<String,Integer>storeMap= new HashMap<String,Integer>();
			
//			String names[]= str.split(" ");
			
//			for (Integer name : names) {
//				
//				Integer count=storeMap.get(name);
//				
//				if(count == null)
//				{
//					storeMap.put(name, 1);
//				}
//				else
//				{
//					storeMap.put(name, ++count);
//				}
//				
//			}
			
			
			
			Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
			
			for (Entry<String, Integer> element : entrySet) {
				
			if(element.getValue()>1)
			{
				System.out.println("The duplicate Element is " +element.getKey()+ "The number of instance is " +element.getValue());
			}
				
			}
			
			
			
			

		}

	}


