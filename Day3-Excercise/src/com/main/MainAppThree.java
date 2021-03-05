/**
 * @author Nadeem
 *
 * 
 */

// 3. write a Java program to sort an integer array of 10 elements in ascending

package com.main;

import java.util.Scanner;

import com.service.ProblemThree;

public class MainAppThree {

	public static void main(String[] args) {

		ProblemThree pThree = new ProblemThree();

		System.out.println("-------Before Sorting--------");
		System.out.print("Enter the size of the array: ");
		Scanner in = new Scanner(System.in);
		int arraySize = in.nextInt();

		int[] array1 = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter " + i + " array elements : ");
			array1[i] = in.nextInt();
		}

		System.out.println("-------After Sorting--------");
		int[] array2 = pThree.sortArray1(array1);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(i + "th element in array is " + array2[i]);
		}

		in.close();

		// dereferencing
		pThree = null;
	}

}
