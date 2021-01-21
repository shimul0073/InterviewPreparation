package com.String;

public class StringDemo {

	public static void main(String[] args) {
		
		
		
		// String is immutable, unmodifiable or unchangeable
		// StringBuilder & StringBuffer is Mutable
		// StringBuilder is not thread safe, It is non Synchronized
		// StringBuffer is thread safe, and it is Synchronized
		// .equals= compare the content
		// == check both reference are same or not, it will good to use for integer value
		
		String a= "Shimul"; // String Literal
		String b= "Shimul";
		
		//System.out.println(a.concat("Hossain"));
		System.out.println(a);
		
		String s= new String ("hello");
		String s1= new String ("hello");// String Classes
		//System.out.println(s.concat("world"));
		s.concat("world");
		System.out.println(s);

		StringBuffer sb= new StringBuffer("shimul");
		sb.append("Hossain");
		System.out.println(sb);
		System.out.println("Here is the reverse of the main word: "+sb.reverse());
		
		System.out.println(a.equals(b));
		System.out.println(a==b);

		
	}

}
