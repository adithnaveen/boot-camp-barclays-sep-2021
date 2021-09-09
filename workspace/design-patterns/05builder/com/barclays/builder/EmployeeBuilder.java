package com.barclays.builder;

import com.barclays.entity.Employee;

public class EmployeeBuilder {
	private int empId;
	private String empName; 
	private String empEmail; 
	private double empSal;
	
	
	public EmployeeBuilder setEmpId(int empId) {
		this.empId = empId; 
		// can have any BL 
		return this; 
	}
	
	public EmployeeBuilder setEmpName(String empName) {
		this.empName = empName; 
		return this; 
	}
	
	public EmployeeBuilder setEmpEmail(String empEmail) {
		this.empEmail  = empEmail; 
		return this; 
	}
	
	public EmployeeBuilder setEmpSal(double empSal) {
		this.empSal = empSal; 
		return this;
	}
	
	public Employee build() {
		return new Employee(empId, empName, empEmail, empSal);
	}
}
