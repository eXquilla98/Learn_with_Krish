package com.exquilla.training.salesmanager.repository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import com.exquilla.training.salesmanager.model.*;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	public List<Employee> getAllEmployees() {
      List<Employee> employees = new ArrayList<>();
      
      Employee employee= new Employee();
      employee.setEmployeeName("Dinuka");
      employee.setEmployeeLocation("Maduhansa");
      employees.add(employee);
      
      return employees;
      
      
}
}
