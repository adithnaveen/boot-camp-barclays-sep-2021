package com.barclays.impl;

import com.barclays.builder.EmployeeBuilder;
import com.barclays.entity.Employee;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Kasturi", "kasturi@barclays.com", 1234); 
		
		Employee emp1 = new EmployeeBuilder()
					.setEmpId(101)
					.setEmpName("Kasturi")
					.setEmpEmail("kasturi@barclays.com")
					.setEmpSal(1234)
					.build();
	}
}
