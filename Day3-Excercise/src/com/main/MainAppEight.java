/**
 * @author Nadeem
 *
 * 
 */

/*8. Write a program to read a string and return a modified string based on the following rules.
Return the String without the first 2 characters except when
a. Keep the first char if it is 'k'
b. Keep the second char if it is 'b'.*/

package com.main;

import com.service.ProblemEight;
import java.util.Scanner;

public class MainAppEight {

	public static void main(String[] args) {
		//

		ProblemEight pEight = new ProblemEight();

		System.out.print("Enter a string : ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		System.out.println("Resultant String: " + pEight.checkString(str));

		in.close();

		// dereferencing
		pEight = null;
	}

}
