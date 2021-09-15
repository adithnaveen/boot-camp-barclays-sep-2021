package com.barclays.rest.works.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.rest.works.contract.IEmployeeService;
import com.barclays.rest.works.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private IEmployeeService service; 
	
	@GetMapping("/")
	public String health() {
		return "Working... to check health";
	}
	
//	@GetMapping("/dummy-emp")
//	public Employee getDummyEmployee() {
//		return service.dummyEmployee();
//	}
	
	@GetMapping("/sayhi/{name}")
	public String sayHi( @PathVariable("name") String name) {
		return "Hi " + name;
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees(); 
	}

	@GetMapping("/employees/{empId}")
	public Employee getEmployee( @PathVariable("empId")  int empId) {
		return service.getEmployeeById(empId); 
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.insertEmployee(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
}




