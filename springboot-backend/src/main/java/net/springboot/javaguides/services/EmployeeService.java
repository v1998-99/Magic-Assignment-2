package net.springboot.javaguides.services;

import java.util.List;

import net.springboot.javaguides.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployess();
	
	Employee getEmployeeById(String id);
	
	Employee updateEmployee(Employee employee , String id);
	
	void deleteEmployee(String id);
}
