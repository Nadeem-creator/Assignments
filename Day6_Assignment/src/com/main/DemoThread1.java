/*Write a program to create a class DemoThread1 implementing  Runnable interface.
 *  In the constructor, create a new thread and start the thread. In run() display a 
 *  message "running child Thread in loop : " display the value of the counter ranging 
 *  from 1 to 10. Within the loop put the thread to sleep for 2 seconds. 
 * In main create 3 objects of the DemoTread1 and execute the program. */

package com.main;


public class DemoThread1 implements Runnable {

	public static void main(String[] args) {
		DemoThread1 obj1 = new DemoThread1();
		DemoThread1 obj2= new DemoThread1();
		DemoThread1 obj3= new DemoThread1();
		obj1.run();
		
		obj1 = null;
		obj2 = null;
		obj3 = null;
	}

	public DemoThread1() {

		UserCode1Main t1 = new UserCode1Main();

		System.out.println("Name of t1:" + t1.getName());

		t1.start();

	}

	@Override
	public void run() {
		System.out.println("running child Thread in loop:");
		int counter = 1;
		while (counter < 11) {
			System.out.println(counter);
		counter = counter + 1;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		}
	}

}
