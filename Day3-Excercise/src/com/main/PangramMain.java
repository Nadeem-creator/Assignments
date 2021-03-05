package com.main;

public class PangramMain {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog";
		boolean[] alphabets = new boolean[26];
		int index = 0;
		int flag = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				index = str.charAt(i) - 'A';
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
			}
			alphabets[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (alphabets[i] == false)
				flag = 0;
		}
		System.out.print("String: " + str);
		if (flag == 1)
			System.out.print("\npangram");
		else
			System.out.print("not a pangram.");
	}
}



