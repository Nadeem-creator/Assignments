/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import java.util.Scanner;

import com.service.MyCalculator;

public class MainApp3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		MyCalculator myCalc = new MyCalculator();

		try {
			System.out.println("Enter a number :");
			int input1 = in.nextInt();
			System.out.println("Enter a number :");
			int input2 = in.nextInt();
			System.out.println(myCalc.power(input1, input2));
		} catch (java.lang.Exception e) {
			System.out.println(e);
		}
		in.close();
		myCalc = null;
	}

}
