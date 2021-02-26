package com.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserCode14 {
//public static String convertDateFormate() {
	
	//public class FormattingDate {
	   public static Date convertDateFormate(String str) throws ParseException {
	      //Instantiating the SimpleDateFormat class
	      SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
	      //Parsing the given String to Date object
	      Date date = formatter.parse(str);
	      //System.out.println("Date object value: "+date);
	      return date;
	   }
	  
	
}

