package com.consuming.api;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class Controller {
	
//	private final AtomicLong counter = new AtomicLong();

	private final EmployeeServiceApi employeeServiceApi;
	

	@Autowired
	public Controller(EmployeeServiceApi employeeServiceApi) {
		super();
		this.employeeServiceApi = employeeServiceApi;
	    

	}

	@GetMapping("/call-api")
	  public OuterStatus callAPI() throws JsonProcessingException {
	    return employeeServiceApi.callAPI();
	  }

//	@GetMapping("/details")
//	private OuterStatus getEmployeedetail() {
		
//		String uri="http://dummy.restapiexample.com/api/v1/employee/1";
		
//		RestTemplate restTemplate = new RestTemplate();
//		OuterStatus outerstatus = restTemplate.getForObject(
//				"http://dummy.restapiexample.com/api/v1/employee/1", OuterStatus.class);
//		return outerstatus;
		
	}

