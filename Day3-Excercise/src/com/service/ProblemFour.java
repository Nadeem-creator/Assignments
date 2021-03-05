package com.service;

public class ProblemFour {

	public String findElement(int[] array, int num) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				str = num + " exists in array";
				break;
			} else {
				str = num + " doesn't exists in array";
			}
		}
		return str;
	}

}
