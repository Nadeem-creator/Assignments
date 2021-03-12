package com.dao;

import java.util.List;

import com.model.Employee;

public interface Employeedao {
	
	public abstract Employee createEmployee(Employee employee);
	public abstract List<Employee> getAllEmployee();
	public abstract Employee readEmployeeById(int emp_id);
	public abstract Employee readEmployeeByName(String empName);
	public abstract int updateEmployee(Employee employee);
	public abstract boolean deleteEmployeeById(int emp_id);
	public abstract boolean deleteEmployeeByName(int empName);
}
