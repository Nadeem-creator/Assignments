package com.main;
/*Rewrite the earlier program so that, now the class DemoThread1 instead of
implementing from Runnable interface, 
will now extend from Thread class. */
public class UserCode4Main extends Thread{

	public static void main(String[] args) {
		DemoThread1 obj1 = new DemoThread1();
		DemoThread1 obj2 = new DemoThread1();
		DemoThread1 obj3 = new DemoThread1();
		obj1.run();

	}

	public UserCode4Main() {

		UserCode1Main t1 = new UserCode1Main();

		System.out.println("Name of t1:" + t1.getName());

		t1.start();

	}

	@Override
	public void run() {
		try {
		System.out.println("running child Thread in loop:");
		int counter = 1;
		
		while (counter < 11) {
			System.out.println(counter);
			counter = counter + 1;
			
				Thread.sleep(2000);
			} }catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

