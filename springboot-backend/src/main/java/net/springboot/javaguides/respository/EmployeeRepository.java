package net.springboot.javaguides.respository;


import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import net.springboot.javaguides.model.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String  > {
	

}
