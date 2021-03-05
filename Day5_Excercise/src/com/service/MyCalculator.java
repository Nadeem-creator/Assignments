package com.service;

import com.exception.UserException;

public class MyCalculator {

	public long power(int num1, int num2) throws UserException {
		long num = 1;
		if (num1 == 0 && num2 == 0) {
			throw new UserException("both n and p can't be zero");
		} else if (num1 < 0 || num2 < 0 || (num1 < 0 && num2 < 0)) {
			throw new UserException("either n or p can't be negative");
		} else {
			for (int i = 0; i < num2; i++) {
				num *= num1;
			}
		}
		return num;
	}

}
