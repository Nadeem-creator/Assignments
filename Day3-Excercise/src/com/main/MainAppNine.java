/**
 * @author Nadeem
 *
 * 
 */

/*9. Write a program to read a string and a character, and reverse the string and convert it in a format such that each character is separated by the given character. Print the final string.
Create a class UserMainCode with a static method reshape which accepts a string and a character. The return type (String) should return the final string.
Create a Class Main which would be used to accept a string and a character, and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string and a character.
Output consists of a string (the final string).
Sample Input:
Rabbit
-
Sample Output:
t-i-b-b-a-R*/

package com.main;

import java.util.Scanner;

import com.service.ProblemNine;

public class MainAppNine {

	public static void main(String[] args) {

		System.out.println("ENter a string : ");
		Scanner in = new Scanner(System.in);
		String str = in.next();

		System.out.println("Enter a character : ");
		char char1 = in.next().charAt(0);

		System.out.println(ProblemNine.wordChanger(str, char1));

		in.close();
	}

}
