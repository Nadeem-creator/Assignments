package com.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.dao.EmployeeDaoImpl;
import com.dao.Employeedao;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger logger = LogManager.getLogger(EmployeeServiceImpl.class);
	@Override
	public Employee createEmployeeService(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeeService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee readEmployeeByIdService(int emp_id) {
		logger.info("Inside byid");
		Employeedao employeeDao = null;
		Employee employee = null;
		int val = String.valueOf(emp_id).length();
		if(val > 4) {
			employeeDao = new EmployeeDaoImpl();
			employee = employeeDao.readEmployeeById(emp_id);
		}else {
			//raise error
			logger.error("Validation failed");
		}
		return employee;
	}

	@Override
	public Employee readEmployeeByNameService(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployeeService(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteEmployeeByIdService(int emp_Id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeByNameService(int empName) {
		// TODO Auto-generated method stub
		return false;
	}

}
