package com.service;

import java.util.regex.Pattern;

public class ProblemSeven {

	public boolean pangaramCheck(String str) {
		return Pattern.matches("[abcdefghijklmnopqrstuvwxyz]", str.toLowerCase().trim());
	}

}
