package net.springboot.javaguides.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.springboot.javaguides.exception.ResourceNotFoundException;
import net.springboot.javaguides.model.Employee;
import net.springboot.javaguides.respository.EmployeeRepository;
import net.springboot.javaguides.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployess() {
		
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(String id) {
		
		Optional<Employee> employee = employeeRepository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
			}
		else {
			throw new ResourceNotFoundException("Employee","Id",id);
		}
	}


	public Employee updateEmployee(Employee employee, String id) {
		
		//First check whether the employee with given id exist in db or not.
		
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee","Id",id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		// save existing employee to DB
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}


	@Override
	public void deleteEmployee(String id) {
		
		// check whether a employee exist in a DB or not
				employeeRepository.findById(id).orElseThrow(() -> 
										new ResourceNotFoundException("Employee", "Id", id));
		
		employeeRepository.deleteById(id);
		
	}
	
	
	

}
