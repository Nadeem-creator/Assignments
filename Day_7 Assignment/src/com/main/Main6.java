
package com.main;

import java.util.Scanner;

import com.model.UserMainCode6;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year and month");
		year = scanner.nextInt();
		month = scanner.nextInt();
		System.out.println(UserMainCode6.getNumberofDays(year, month));
		scanner.close();
	}

}
