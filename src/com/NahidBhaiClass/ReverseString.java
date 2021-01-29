package com.NahidBhaiClass;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reverse a String with and without using existing java library

		// 1. Reverse a String with using existing java library?

		String input="Shimul";
		String reverseWord="";
		int len= input.length();
		
		StringBuilder sb= new StringBuilder();
		
		sb.append(input);
		
		sb.reverse();
		
		System.out.println("Reverse a String with using existing java library: " + sb);
		
		// 2. Reverse a String without using existing java library?
		
		char[] actualWord=input.toCharArray();  //@ We can reverse the string using char[] too.
		
		for (int i= len-1;i>=0;i--) {
			
			//reverseWord= reverseWord + input.charAt(i);
		 reverseWord= reverseWord + actualWord[i];
		}
		
		System.out.println("Reverse a String without using existing java library:" + reverseWord);
	}

}
