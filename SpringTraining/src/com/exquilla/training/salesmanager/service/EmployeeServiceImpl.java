package com.exquilla.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exquilla.training.salesmanager.repository.*;
import com.exquilla.training.salesmanager.model.Employee;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
 public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Setter injection fired");
		this.employeeRepository = employeeRepository;
	}


public EmployeeServiceImpl() {
	
	System.out.println("Default constructor executed");
}

public EmployeeRepository getEmployeeRepository() {
	return employeeRepository;
}

@Autowired
EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getAllEmployees(); 
	}

	

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

}

