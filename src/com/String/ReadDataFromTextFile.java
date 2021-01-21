package com.String;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// First Approach: FileReader & BufferRreader

		/*
		 * FileReader fr= new FileReader("C:\\Users\\user\\Downloads\\Test123.txt");
		 * BufferedReader br=new BufferedReader(fr);
		 * 
		 * String str;
		 * 
		 * while((str=br.readLine())!=null) { System.out.println(str); } br.close();
		 * 
		 * }
		 */

		// 2nd Approach: Scanner & File

		File file = new File("C:\\\\Users\\\\user\\\\Downloads\\\\Test123.txt");

		Scanner sc = new Scanner(file);

		/*
		 * while (sc.hasNextLine()) { System.out.println(sc.nextLine());
		 * 
		 * }
		 */
		// 3rd Approach: Scanner & Delimiter
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
		
		
	}
	
	

}
