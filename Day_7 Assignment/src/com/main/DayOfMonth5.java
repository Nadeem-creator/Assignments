package com.main;
import java.util.Scanner;
public class DayOfMonth5 {


	
		public static void main(String[] args) {
			
		
			int year, month;
			Scanner scanner = new Scanner(System.in);
			month = scanner.nextInt();
			year = scanner.nextInt();
			scanner.close();
			if(month == 0 || month == 2|| month == 4 || month == 6|| month == 7 || month == 9 || month == 11)
				System.out.print("Number of days is 31");
			else if((month == 1) && ((year%400==0) || (year%4==0 && year%100!=0)))
			{
				System.out.print("Number of days is 29");
			}
			else if(month == 1)
			{
				System.out.print("Number of days is 28");
			}
			else
				System.out.println("Number of days is 30");
		}
	
		
	}

