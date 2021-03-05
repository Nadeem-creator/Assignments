/**
 * @author Nadeem
 *
 * 
 */

/*5. Accept a string, and two indices(integers), and print the substring consisting of all characters inclusive range from ..to .
Sample Input
Helloworld
3 7
Sample Output
Lowo*/

package com.main;

import java.util.Scanner;

import com.service.ProblemFive;

public class MainAppFive {

	public static void main(String[] args) {

		ProblemFive pFive = new ProblemFive();

		System.out.print("Enter a string : ");
		Scanner in = new Scanner(System.in);
		String str = in.next();

		System.out.println("Enter the indices values between "+ 0 +" & " + (str.length()-1));

		System.out.print("Enter first index : ");
		int index1 = in.nextInt();

		System.out.print("Enter last index : ");
		int index2 = in.nextInt();

		System.out.println(pFive.stringArray(str, index1, index2));

		in.close();

		// dereferencing
		pFive = null;
	}

}
