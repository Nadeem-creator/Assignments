package com.model;

/**
 * 
 * @author Nadeem
 *
 */

public class Employee {
	private int emp_id;
	private String firstname;
	private String lastName;
	private int age;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int emp_id, String firstname, String lastName, int age) {
		super();
		this.emp_id = emp_id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.age = age;
	}
	public Employee() {
		super();
	}
}
