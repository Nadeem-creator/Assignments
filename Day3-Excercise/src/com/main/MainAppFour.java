/**
 * @author Nadeem
 *
 * 
 */

// 4. write a Java program to search for an element of an integer array of 10
// elements.

package com.main;

import java.util.Scanner;

import com.service.ProblemFour;

public class MainAppFour {

	public static void main(String[] args) {

		ProblemFour pFour = new ProblemFour();

		System.out.print("Enter the size of the array: ");
		Scanner in = new Scanner(System.in);
		int arraySize = in.nextInt();

		int[] array1 = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter " + i + " array elements : ");
			array1[i] = in.nextInt();
		}
		System.out.println("Enter the number to be found: ");
		int number = in.nextInt();

		System.out.println(pFour.findElement(array1, number));

		in.close();

		// dereferencing
		pFour = null;

	}

}
