package com.NahidBhaiClass;

public class LongestStringInAnArray {

	// Find Longest string in a Array

	public static String getLongestString(String[] array) {

		int maxLength = 0;
		String longestString = null;

		for (String s : array) {
			if (s.length() > maxLength) {
				maxLength = s.length();
				longestString = s;

			}
		}
		return longestString;

	}

	public static void main(String[] args) {

		String[] words = { "abd", "aerr", "sd", "ifiwanttolsdfsdearn", "ahdjry", "kamonasotumiameip" };
		String longestString = getLongestString(words);
		System.out.println(longestString);

	}
}
