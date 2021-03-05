package com.service;

public class ProblemSix {

	public String palindromeCheck(String word) {
		int halfLength = word.length() / 2;
		String temp = "";
		for (int i = 0; i < halfLength; i++) {
			if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
				temp = "Yes, " + word + " is a palindrome";
			} else {
				temp = "No, " + word + " is a not a palindrome";
				break;
			}
		}
		return temp;
	}

}
