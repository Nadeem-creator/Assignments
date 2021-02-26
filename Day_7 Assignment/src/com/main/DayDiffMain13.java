
		package com.main;

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.text.ParseException;

		import com.model.DayDiff13;

		public class DayDiffMain13 {
			public static void main(String[] args) throws ParseException, IOException {
			    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    System.out.println("Enter date in format dd-mm-yyyy :");
			    String s1 = br.readLine();
			    System.out.println("Enter date in format dd-mm-yyyy :");
			    String s2 = br.readLine();
			    System.out.println(DayDiff13.getDateDifference(s1, s2));
			  }
		
}
