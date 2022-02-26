package net.springboot.javaguides.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.springboot.javaguides.model.Employee;
import net.springboot.javaguides.services.EmployeeService;

@RestController

public class EmployeeController {
	
	private EmployeeService employeeService;
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	//Build create Employee Rest Api
	
	@PostMapping("/api/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
		
		
	}
	//Build get All Employee Rest Api
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployess();
	}
	
	//Build get Employee by Id Rest Api
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String employeeid){
		
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeid),HttpStatus.OK);
		
	}
	
	//Build Update Employee Rest Api
	
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") String id
			                                       ,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id),HttpStatus.OK);
		
	}
	//Build Delete Employee Rest Api
	@DeleteMapping("/emp/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") String id){
		
		employeeService.deleteEmployee(id);
		
		return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
	}
}
