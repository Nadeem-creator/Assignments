package com.main;

import java.util.Scanner;

import com.model.UserIpCode;

public class IpValidMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ip address: ");
		String ipAddress = sc.nextLine();
		
		boolean b = UserIpCode.ipValidator(ipAddress);
		if (b == true)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

	

}
