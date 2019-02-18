package com.javapracticeMyOwn;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesinString {

	public static void main(String[] args) {
	 String s="Java is nice and Java is beautiful and Java is platform Independent";
	 String words[]=s.split(" ");
	 
	 
	 List<String> duplicates= new ArrayList<String>();
	 
	 for(int i=0;i<words.length;i++)
	 {
		 int count=1;
		 if(!duplicates.contains(words[i]))
		 {
			 for(int j=i+1;j<words.length;j++)
			 {
				 if(words[i].equals(words[j]))
						 {
					 count++;
						 }
			 }
		 
			 if(count>1)
			 {
				 System.out.println("The number of duplicates is "+count +"And the word repeated is " +words[i]);
				 duplicates.add(words[i]);
			 }
		 }
	 }
	 
	 
	 
	}
}


