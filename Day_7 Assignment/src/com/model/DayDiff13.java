
package com.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayDiff13 {

	public static int getDateDifference(String s1, String s2) throws ParseException {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sd.parse(s1);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		long d1 = c.getTimeInMillis();
		d = sd.parse(s2);
		c.setTime(d);
		long d2 = c.getTimeInMillis();
		int n = Math.abs((int) ((d1 - d2) / (1000 * 3600 * 24)));
		return n;
	}

}
