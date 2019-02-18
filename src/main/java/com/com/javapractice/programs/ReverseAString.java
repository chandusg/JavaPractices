package com.com.javapractice.programs;

public class ReverseAString {

	public static void main(String[] args) {
		
		
		String Str="Java sentence";
		
		int count=Str.length();
		
		
		String revStr="";
		
        for(int i=count-1;i>=0;i--)
        {
        	revStr=revStr+Str.charAt(i);
        }
		
		
	}

}
