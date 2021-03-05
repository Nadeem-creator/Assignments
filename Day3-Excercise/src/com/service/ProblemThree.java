package com.service;

public class ProblemThree {

	public int[] sortArray1(int[] array1) {
		int temp = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] > array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		return array1;
	}

}
