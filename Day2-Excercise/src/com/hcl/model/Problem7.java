package com.hcl.model;

public class Problem7 {
	//Hello I am a motorcycle, I am a cycle with an engine.

	//My ancestor is a cycle who is a vehicle with pedals.

	class Cycle{

	String define_me(){

	return "a vehicle with pedals.";

	}

	}

	class Bike extends Cycle{

	String define_me(){

	return "a cycle with an engine.";

	}

	Bike(){

	System.out.println("Hello I am a Bike I am "+ define_me());

	String temp=define_me();

	System.out.println("My ancestor is a cycle who is "+ temp );

	}

	}

	class InheritenceExample{

//	public static void main(String []args){
//
//	Bike M=new Bike();
//
//	}

	}
}
