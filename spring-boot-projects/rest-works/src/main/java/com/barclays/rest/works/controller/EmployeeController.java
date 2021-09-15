package com.barclays.rest.works.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.rest.works.entity.Employee;
import com.barclays.rest.works.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service; 
	 
	@GetMapping("/")
	public String health() {
		return "Working... to check health";
	}
	
	@GetMapping("/dummy-emp")
	public Employee getDummyEmployee() {
		return service.dummyEmployee();
	}
}
