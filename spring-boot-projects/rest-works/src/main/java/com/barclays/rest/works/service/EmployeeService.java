package com.barclays.rest.works.service;

import org.springframework.stereotype.Service;

import com.barclays.rest.works.entity.Employee;

@Service
public class EmployeeService {
	public Employee dummyEmployee() {
		return new Employee(101, "Sanya", 2234);
	}
}
