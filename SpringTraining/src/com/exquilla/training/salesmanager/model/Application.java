package com.exquilla.training.salesmanager.model;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exquilla.training.salesmanager.*;
import com.exquilla.training.salesmanager.service.*;


public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationontext.xml");
		
		
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
		List<Employee> employees=employeeService.getAllEmployees();
		
		for(Employee employee :employees) {
			System.out.println(employee.getEmployeeName()+"at"+employee.getEmployeeLocation());
			
			
		}

	}

}
