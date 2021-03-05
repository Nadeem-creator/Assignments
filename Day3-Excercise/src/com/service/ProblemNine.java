package com.service;

public class ProblemNine {

	public static String wordChanger(String str, char char1) {
		String resultString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
			resultString += str.charAt(i);
			resultString += char1;
		}
		return resultString;
	}

}
