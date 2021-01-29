package com.NahidBhaiClass;

import java.util.Scanner;

public class BreakTheLineOfaParagraph {

	// 2. Break the line of a paragraph by given column length?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myParagraph = "asdsa das dasd sa dsad asddsad asd asdsadsa asdas dasd ddsad gfssad safgdd sgfjjd gdsad ";
		
		// Break the line of a paragraph by each word
 
		Scanner input = new Scanner(myParagraph);

		while (input.hasNext()) {

			System.out.println(input.next());

		}

		// Break the line of a paragraph by whitespace	

		String[] sentences = myParagraph.split(" ");
		
		for (String str : sentences) {
			System.out.println(str);
		}

		}
	
	}


