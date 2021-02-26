package com.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter player name : ");
		String name= in.next();
		System.out.println("Enter team name : ");
		String teamName= in.next();
		System.out.println("Enter number of matches played : ");
		String matches= in.next();
		
		char[] array=new char[100];
		
		File file = new File("src//com//main//textFile6.txt");
		FileWriter fW;
		FileReader fR;
		try {
			file.createNewFile();
			fW = new FileWriter(file);
			fW.append(name);
			fW.append(',');
			fW.append(teamName);
			fW.append(',');
			fW.append(matches);
			fW.close();
			fR =new FileReader(file);
			fR.read(array);
			System.out.println(array);
			fR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		in.close();

	}

}
