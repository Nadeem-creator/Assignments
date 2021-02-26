
package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.model.UserCode14;

public class DateConverterMain14{
			public static void main(String args[]) throws ParseException {
				
				Scanner sc = new Scanner(System.in);

				System.out.println("Enter your date  (dd/mm/yyyy): ");
				String str = sc.next();

				Date date = UserCode14.convertDateFormate(str);

				System.out.println("Date in the format: dd-mm-yy");
				System.out.println(new SimpleDateFormat("dd-mm-yy").format(date));

}

}
