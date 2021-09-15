package com.barclays.rest.works.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.barclays.rest.works.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

	// you can build custom queries here 
}
