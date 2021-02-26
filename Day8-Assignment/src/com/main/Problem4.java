package com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem4 {

	public static void main(String[] args) {
		
		int lines=0;
		try {
			FileReader fileR = new FileReader("src//com//main//textFile4.txt");
			BufferedReader br=new BufferedReader(fileR);
			while(lines <= 2) {
				System.out.println(br.readLine());
				lines++;
			}
			fileR.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
