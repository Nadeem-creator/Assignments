package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.Employee;

public class EmployeeDaoImpl implements Employeedao {

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee readEmployeeById(int emp_id) {
		Employee employee = null;
		String read = "select * from employee where emp_id= ?";
		Connection connection=JDBCConnection.getConnection();
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(read);
			preparedStatement.setInt(1, emp_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			employee = new Employee();
			while(resultSet.next()) {
				employee.setEmp_id(resultSet.getInt("emp_id"));
				employee.setFirstname(resultSet.getString("firstname"));
				employee.setLastName(resultSet.getString("lastname"));
				employee.setAge(resultSet.getInt("age"));
				
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return employee;
	}

	@Override
	public Employee readEmployeeByName(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteEmployeeById(int emp_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeByName(int empName) {
		// TODO Auto-generated method stub
		return false;
	}

}
