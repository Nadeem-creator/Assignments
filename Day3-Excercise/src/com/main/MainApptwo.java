/**
 * @author Nadeem
 *
 * 
 */

//2. Write a Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string.

package com.main;

import java.util.Scanner;

import com.service.ProblemTwo;

public class MainApptwo {

	public static void main(String[] args) {

		ProblemTwo pTwo = new ProblemTwo();

		System.out.print("Enter a string : ");
		Scanner in = new Scanner(System.in);
		String str = in.next();

		System.out.print("Enter the character you want to replace: ");
		char ch1 = in.next().charAt(0);
		System.out.print("Enter the character you want to replac with: ");
		char ch2 = in.next().charAt(0);

		System.out.println("Charcter Replaced String is: " + pTwo.replaceChar(str, ch1, ch2));

		in.close();
		
		//dereferencing
		pTwo=null;

	}

}
