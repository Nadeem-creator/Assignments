/**
 * @author Nadeem
 *
 * 
 */


/*  6. Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise.
  Sample Input madam Sample Output Yes*/
 

package com.main;

import java.util.Scanner;

import com.service.ProblemSix;

public class MainAppSix {

	public static void main(String[] args) {

		ProblemSix pSix = new ProblemSix();

		System.out.print("Enter a string : ");
		Scanner in = new Scanner(System.in);
		String str = in.next();

		System.out.println(pSix.palindromeCheck(str));

		in.close();

		// dereferencing
		pSix = null;

	}
}
