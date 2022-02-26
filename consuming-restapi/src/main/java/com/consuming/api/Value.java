package com.consuming.api;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="employeedetail")
public class Value {
	
	private int id;
	private String employee_name;
	private int employee_age;
	private String profile_image;
	private int employee_salary;
	
	public int getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}

	public Value() {
		super();
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public int getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(int employee_age) {
		this.employee_age = employee_age;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}

	@Override
	public String toString() {
		return "Value [id=" + id + ", employee_name=" + employee_name + ", employee_age=" + employee_age
				+ ", profile_image=" + profile_image + "]";
	}
	
	

}
