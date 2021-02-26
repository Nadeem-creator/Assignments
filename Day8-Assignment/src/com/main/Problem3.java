package com.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Problem3 {

	public static void main(String[] args) {
		
		File file = new File("src//com//main//textFile3.txt");
		FileWriter fileW;
		try {
			file.createNewFile();
			fileW = new FileWriter(file);
			fileW.append("Writing into text3 File");
			fileW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
