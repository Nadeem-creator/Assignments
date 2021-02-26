package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem5{
	public static void main(String args[])throws FileNotFoundException{
		 new Problem5().findLongestWords();
	}
	Scanner in;
	public String findLongestWords() throws FileNotFoundException{
		String longest_word="";
		String current;
		in=new Scanner(new File("src//com//main//textFile2.txt"));
		while(in.hasNext()) {
			current=in.next();
			if(current.length()>longest_word.length()) {
				longest_word=current;
			}
		}
		System.out.println("\n"+longest_word+"\n");
		return longest_word;
		
	}
}
