package com.main;

import java.util.Scanner;
import com.model.UserCode7;

public class MainCheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scanner.next();
		int res = UserCode7.checkCharacters(s);
		scanner.close();
		if (res == -1)
			System.out.println("Invalid Input");
		else if (res == 1)
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}

}
