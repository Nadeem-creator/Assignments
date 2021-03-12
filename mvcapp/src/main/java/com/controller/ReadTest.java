package com.controller;

import com.dao.EmployeeDaoImpl;
import com.dao.Employeedao;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class ReadTest {
	public static void main(String[] args) {
		EmployeeService ref = new EmployeeServiceImpl();
		Employee temp = ref.readEmployeeByIdService(12345);
		System.out.println(temp.getAge());
		System.out.println(temp.getFirstname());
	}
}
