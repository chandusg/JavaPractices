package com.javapractice.programs;

import java.util.ArrayList;
import java.util.List;

public class DuplicatsInStringUsingForLoop {

	public static void main(String[] args) {
		String str= "Java is nice and Java is beautiful and Java is platform Independent";
		
		String[] names= str.split(" ");
		
		
		List<String> result= new ArrayList<String>();
		
		for(int i=0;i<names.length;i++)
		{
			int count=1;
			if(!result.contains(names[i]))
			{
				for(int j=i+1;j<names.length;j++)
				{
					if(names[i]==names[j])
					{
						count++;
					}
				}
				if(count>1)
				{
					System.out.println("The repeated word is " +names[i] + " The repreated time is " +count);
					result.add(names[i]);
				}
			}
		}
		
		
	
		

	}

}
