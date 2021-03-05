package com.main;

import java.text.SimpleDateFormat;

/**In the previous program remove the try{}catch(){} block surrounding the sleep method
	 and try to execute the code.
	 What is your observation?*/

	import java.util.Date;

	public class UserCode2Main {

		public static void main(String[] args) throws InterruptedException {
			UserCode1Main t1 = new UserCode1Main();

			System.out.println("Name of t1:" + t1.getName());

			t1.start();

			t1.setName("MyThread");
			System.out.println("After changing name of t1:" + t1.getName());
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
			System.out.println("time : " + sdf.format(date));

			Thread.sleep(10000);
			Date date1 = new Date();
			SimpleDateFormat sdf1 = new SimpleDateFormat("kk:mm:ss");
			System.out.println("time after sleep : " + sdf1.format(date1));

		}

	}

