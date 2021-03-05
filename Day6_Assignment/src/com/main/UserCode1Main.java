package com.main;
/*Write a program to assign the current thread to t1. 
Change the name of the thread to MyThread. 
Display the changed name of the thread. Also it should display the current time.
Put the thread to sleep for 10 seconds and display the time again. */


import java.text.SimpleDateFormat;
import java.util.Date;

public class UserCode1Main extends Thread {

	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		try {
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
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}

