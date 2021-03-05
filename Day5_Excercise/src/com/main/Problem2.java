/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Enter a number :");
			int input1 = in.nextInt();
			System.out.println("Enter a number :");
			int input2 = in.nextInt();
			System.out.println(input1 / input2);
		} catch (java.lang.Exception j) {
			System.out.println(j);
		}
		in.close();
	}

}
