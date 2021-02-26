
package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

import com.model.User11;

public class MonthDiff11Main {

	public static void main(String[] args) throws ParseException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date in yyyy-mm-dd");
		String s1 = br.readLine();
		System.out.println("Enter the date in yyyy-mm-dd");
		String s2 = br.readLine();

		System.out.println(User11.getMonthDifference(s1, s2));
	}

}
