package com.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String name= in.next();
		System.out.println("Enter word to be found : ");
		String word= in.next();
		
		char[] array=new char[100];
		
		File file = new File("src//com//main//textFile6.txt");
		FileWriter fW;
		FileReader fR;
		try {
			file.createNewFile();
			fW = new FileWriter(file);
			fW.append(name);
			fW.close();
			fR =new FileReader(file);
			fR.read(array);
			System.out.println(array.toString().contains(word));
			System.out.println(array);
			fR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		in.close();


	}

}
