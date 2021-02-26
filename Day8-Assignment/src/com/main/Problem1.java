package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter name: ");
		//enter data using BufferReader
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//Reading
		String name=reader.readLine();
		//Display the readline
		System.out.println("Hello "+name+"!");

	}

}
