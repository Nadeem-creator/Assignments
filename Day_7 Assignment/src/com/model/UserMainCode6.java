package com.model;

public class UserMainCode6 {
public static int getNumberofDays(int year,int month) {
	if(month == 0 || month == 2|| month == 4 || month == 6|| month == 7 || month == 9 || month == 11)
		return 31;
	else if((month == 1) && ((year%400==0) || (year%4==0 && year%100!=0)))
	{
		return 29;
	}
	else if(month == 1)
	{
		return 28;
	}
	else
		return 30;
}
}

