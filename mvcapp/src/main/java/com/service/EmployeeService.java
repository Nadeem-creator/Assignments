package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	public abstract Employee createEmployeeService(Employee employee);
	public abstract List<Employee> getAllEmployeeService();
	public abstract Employee readEmployeeByIdService(int emp_Id);
	public abstract Employee readEmployeeByNameService(String empName);
	public abstract int updateEmployeeService(Employee employee);
	public abstract boolean deleteEmployeeByIdService(int emp_Id);
	public abstract boolean deleteEmployeeByNameService(int empName);
}
