package com.student.crudwebapp.service;

import java.util.List;

import com.student.crudwebapp.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeByID(long id);

}
