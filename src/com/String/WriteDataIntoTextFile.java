package com.String;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw= new FileWriter("C:\\Users\\user\\Downloads\\Test123.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		fw.write("My name is shimul and i like to play cricket");
		System.out.println("Coading done");
		fw.close();
	}

}
