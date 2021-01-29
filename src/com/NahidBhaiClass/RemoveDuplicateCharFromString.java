package com.NahidBhaiClass;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {
	
	// remove duplicate character from a string.

	public static String removeDuplicates(String word) {

		Set<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		String word = "Java is a morden language";

		System.out.println(removeDuplicates(word));
	}

}
