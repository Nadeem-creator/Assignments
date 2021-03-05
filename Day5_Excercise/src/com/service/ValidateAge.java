package com.service;

import com.exception.CustomExceptionFour;

public class ValidateAge {

	public void ageValidation(String name, int age) throws CustomExceptionFour {
		if (age < 19) {
			throw new CustomExceptionFour("Custom Exception: InvalidAgeRangeException");
		} else {
			System.out.println("Player Name : " + name);
			System.out.println("Player age : " + age);
		}
	}

}
