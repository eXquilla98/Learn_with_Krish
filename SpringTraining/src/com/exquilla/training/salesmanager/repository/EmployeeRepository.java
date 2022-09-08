package com.exquilla.training.salesmanager.repository;

import java.util.List;



import com.exquilla.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}