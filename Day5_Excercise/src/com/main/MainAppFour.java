/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import java.util.Scanner;

import com.exception.CustomExceptionFour;
import com.service.ValidateAge;

public class MainAppFour {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ValidateAge validateAge = new ValidateAge();
		try {
			System.out.println("Enter player name: ");
			String name = in.next();
			System.out.println("Enter player age");
			int age = in.nextInt();

			validateAge.ageValidation(name, age);
		} catch (CustomExceptionFour cs) {
			System.out.println(cs.getMessage());
		}
		in.close();
		validateAge = null;
	}

}
