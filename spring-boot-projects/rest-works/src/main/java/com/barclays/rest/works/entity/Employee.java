package com.barclays.rest.works.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	private int empId;
	private String empName; 
	private double salary;
	
	
	
	
	public Employee() {}
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	 
	
	
	
	
}
