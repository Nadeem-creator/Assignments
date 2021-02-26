package com.main;

import java.util.Calendar;

public class Fourth {

	public static void main(String[] args) {
		 // Create a default calendar
        Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println("Current Date and Time:" + cal.getTime());		
		int MaxYear = cal.getMaximum(Calendar.YEAR);
		int MaxMonth =cal.getMaximum(Calendar.MONTH);
		int MaxWeek = cal.getMaximum(Calendar.WEEK_OF_YEAR);
		int MaxDate = cal.getMaximum(Calendar.DATE);
		System.out.println("Maximum Year: "+MaxYear);
		System.out.println("Maximum Month: "+MaxMonth);
		System.out.println("Maximum Week of Year: "+MaxWeek);
		System.out.println("Maximum Date: "+MaxDate+"\n");
		System.out.println();
		
	  }



	}

