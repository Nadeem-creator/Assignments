package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

@WebServlet("/AppServlet")
public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String arg = request.getParameter("searchEmpId");
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.readEmployeeByIdService(Integer.parseInt(arg));
		RequestDispatcher requestDispatcher = null;
		if(employee == null) {
			requestDispatcher = request.getRequestDispatcher("/jsp/failure.jsp");
			requestDispatcher.forward(request, response);
		}else {
			requestDispatcher = request.getRequestDispatcher("/jsp/displayEmployee.jsp");
			request.setAttribute("key1", employee);
			requestDispatcher.forward(request, response);
		}
		
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
