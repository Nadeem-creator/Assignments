package com.model;

public class UserCode7 {
	

		public static int checkCharacters(String s) {
			int n = s.length();
			if (n < 2)
				return -1;
			if (s.charAt(0) == s.charAt(n - 1))
				return 1;
			else
				return 0;
		}
	}

