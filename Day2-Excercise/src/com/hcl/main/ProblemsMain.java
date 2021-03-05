/**
 * @author Nadeem
 *
 * 
 */

package com.hcl.main;

import com.hcl.service.ServiceClass;
import com.hcl.model.RoomClass;
import com.hcl.model.Addition;
import com.hcl.model.ClassB;
import com.hcl.model.Bike;
import com.hcl.model.Dog;
import com.hcl.model.Parent;
import com.hcl.model.Child1;
import com.hcl.model.Child2;

public class ProblemsMain {

	public static void main(String[] args) {

		ServiceClass serviceClass = new ServiceClass();

		System.out.println("-----------------One------------------");
		System.out.println(serviceClass.smallestNumber(10, 2, 3) + " is the smallest number");

		System.out.println("-----------------Two------------------");
		char[] result = serviceClass.middleCharacter("Jagan");
		// trying result[1] hasn't worked. why?
		if ((int) result[1] == 0) {
			System.out.println("The middle character in string :" + result[0]);
		} else {
			System.out.println("The middle characters in string :" + result[0] + "," + result[1]);
		}

		System.out.println("-----------------Three------------------");
		System.out.println("Number of vowels in string : " + serviceClass.vowelCounter("jagan"));

		System.out.println("--------------Four-------------");
		RoomClass roomClass = new RoomClass(2, "Ac", "Marathahalli", "Voltas");
		roomClass.display();

		System.out.println("----------------Five-----------------");
		ClassB classB = new ClassB();
		classB.display();

		System.out.println("------------------Six-----------------");
		Addition addition = new Addition();
		addition.additionOfNumbers(1, 2, 3, 4, 5);

		System.out.println("------------------Seven-----------------");
		Bike bike = new Bike();

		System.out.println("-------------------Eight----------------");
		Dog dog = new Dog();

		dog.eat();
		dog.walk();
		dog.bark();

		System.out.println("---------------------Nine----------------");

		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();

		System.out.println(c1 instanceof Parent);
		System.out.println(c2 instanceof Parent);
		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);

		p = c1;
		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);

		p = c2;
		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);

		// Dereferencing
		serviceClass = null;
		roomClass = null;
		classB = null;
		addition = null;
		bike = null;
		dog = null;
		p = null;
		c1 = null;
		c2 = null;
	}

}
