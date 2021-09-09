package com.barclays.entity;

public class Employee {
	private int empId;
	private String empName; 
	private String empEmail; 
	private double empSal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String empEmail, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSal = empSal;
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

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
}
