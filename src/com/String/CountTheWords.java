 package com.String;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine(); // Welcome to Java
		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {

			if ((s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')) {
				count++;
			}

		}
		System.out.println("Total word of this sentence is: "+ count);
	}

}
