package com.hcl.service;

public class ServiceClass {
	
	public int smallestNumber(int num1, int num2, int num3) {
		int temp=0;
		if(num1 < num2 && num1 < num3) {
			temp=num1 ;
		}
		else if(num2 < num1 && num2 < num3) {
			temp=num2 ;
		}
		else if(num3 < num1 && num3 < num2) {
			temp=num3 ;
		}
		return temp;
	}
	
	public char[] middleCharacter(String stringName) {
		int[] temp=new int[2];
		char[] strings= new char[2];
		if(stringName.length()%2 == 0) {
			temp[1] = stringName.length()/2;
			temp[0] = temp[1] - 1;
			strings[0] = stringName.charAt(temp[0]);
			strings[1] = stringName.charAt(temp[1]);
		}else {
			temp[0] = stringName.length()/2;
			strings[0] = stringName.charAt(temp[0]);
		}
		return strings;
		
	}
	
	public int vowelCounter(String name) {
		int temp=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i) == 'a' ||name.charAt(i) == 'e' ||name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
				temp=temp+1;
			}
		}
		return temp;
	}
	
	

}
