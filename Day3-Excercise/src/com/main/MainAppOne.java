/**
 * @author Nadeem
 *
 * 
 */

// 1. Write a Java program to convert all the characters in a string to
// lower-case

package com.main;

import java.util.Scanner;

import com.service.ProblemOne;

public class MainAppOne {

	public static void main(String[] args) {

		ProblemOne pOne = new ProblemOne();

		System.out.print("Enter a string : ");
		Scanner in = new Scanner(System.in);
		String str = in.next();

		System.out.println("LowerCase Input String is: " + pOne.toLowerCaseLetters(str));

		in.close();

		// dereferencing
		pOne = null;

	}

}
