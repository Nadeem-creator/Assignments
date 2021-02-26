package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.model.CompareUserCode10;
import com.model.DayDiff13;
import com.model.UserCode14;

public class CompareDatesMain {

	public static void main(String[] args) throws ParseException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		String s2=br.readLine();
		 System.out.println( CompareUserCode10.getDateDifference(s1,s2));
		

	}
}
