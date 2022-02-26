package com.consuming.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class EmployeeServiceApi {
	
	  private final RestTemplate restTemplate;
	  private final ObjectMapper mapper = new ObjectMapper();
	  private final DataRepository dataRepository;
	  
	 @Autowired
	public EmployeeServiceApi(RestTemplate restTemplate, DataRepository dataRepository) {
		super();
		this.restTemplate = restTemplate;
		this.dataRepository = dataRepository;
	}
	
	OuterStatus callAPI() throws JsonProcessingException {
		   String resp = restTemplate.getForObject("http://demo9576678.mockable.io/api/v1/employee/1", String.class);

		   OuterStatus os = mapper.readValue(resp, OuterStatus.class);
		   Value value = os.getData();

		   dataRepository.save(value);
		   return mapper.readValue(resp, OuterStatus.class);
//		    DummyServiceResponse dsr = mapper.readValue(resp.getBody(), DummyServiceResponse.class);
//		    log.info(dsr.toString());
//		    return resp.getBody();
		  }
		}
	  


