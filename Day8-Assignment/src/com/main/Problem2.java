package com.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem2 {

	public static void main(String[] args) {
		
		File file = new File("src//com//main//textFile2.txt") ;
		FileWriter fileWriter;
		FileReader fileReader;
		char[] array= new char[100];
		try {
			file.createNewFile();
			fileWriter = new FileWriter(file);
			fileWriter.append("Hey! I am writing into the file.");
			fileWriter.close();
			fileReader = new FileReader(file);
			fileReader.read(array);
			System.out.println(array);
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
