package com.service;

public class ProblemEight {

	public String checkString(String str) {
		String temp = "";
		if (str.toLowerCase().charAt(0) == 'k' && str.toLowerCase().charAt(1) == 'b') {
			temp = str;
		} else if (str.toLowerCase().charAt(0) != 'k' && str.toLowerCase().charAt(1) != 'b') {
			str = deleteSubString(str, 0);
			str = deleteSubString(str, 0);
			temp = str;
		} else if (str.toLowerCase().charAt(0) != 'k') {
			str = deleteSubString(str, 0);
			temp = str;
		} else if (str.toLowerCase().charAt(1) != 'b') {
			str = deleteSubString(str, 1);
			temp = str;
		}
		return temp;
	}

	private String deleteSubString(String str, int index) {
		return str.substring(0, index) + str.substring(index + 1);
	}

}
