/**
 * @author Nadeem
 *
 * 
 */

/*7. Write a program to find the given string is pangram or not.
(Hint: Pangrams are words or sentences containing every letter of the alphabet at least once)
Sample Input
The quick brown fox jumps over the lazy dog sp.
Sample Output:
Pangram*/

/*Still Pending*/

package com.main;

import com.service.ProblemSeven;
import java.util.Scanner;

public class MainAppSeven {

	public static void main(String[] args) {

		ProblemSeven pSeven = new ProblemSeven();
		
		System.out.println("Enter a string : ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(pSeven.pangaramCheck(str));
		System.out.println(pSeven.pangaramCheck(str) ? "Yes, pangram" : "Not a pangram");

		in.close();

		// dereferencing
		pSeven = null;

	}

}
