/**
 * @author Nadeem
 *
 * 
 */

import java.util.Scanner;

public class StaticProblemsMain {
	public static void main(String[] args) {
		System.out.println("-----------Eight-------------");

		System.out.println(StaticProblemsService.checkSum(1257));

		System.out.println("--------Nine----------------------");

		System.out.println("sum of squares of even digits is " + StaticProblemsService.sumOfEVenDigits(17665));

		System.out.println("--------Ten----------------------");

		Scanner input1 = new Scanner(System.in);
		String userGivenInput;
		System.out.println("Enter a line of words:");
		userGivenInput = input1.nextLine();

		System.out.println(StaticProblemsService.highestWordCalculator(userGivenInput) + " is the highest length word");

		input1.close();
	}

}
