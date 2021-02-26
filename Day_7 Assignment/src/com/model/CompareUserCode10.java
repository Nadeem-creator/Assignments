package com.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareUserCode10 {
	//public static String d;
		public static String getDateDifference(String s1,String s2) throws ParseException{ 
		SimpleDateFormat sd = new SimpleDateFormat("dd-mm-yyyy");
		SimpleDateFormat sd1 = new SimpleDateFormat("mm/dd/yyyy");
		
		Date d1= sd.parse(s1);
		Date d2 = sd.parse(s2);
		//Date date = UserCode14.convertDateFormate(str);
		System.out.println("date1 is " + sd.format(d1));
		System.out.println("date2 is " + sd.format(d2));
		
		if(d1.compareTo(d2) > 0)
		{
		    return sd1.format(d2); 
		
		}
		else 
		{
			return sd1.format(d1);
		   
		}
	   
	    
	}
		
	}





