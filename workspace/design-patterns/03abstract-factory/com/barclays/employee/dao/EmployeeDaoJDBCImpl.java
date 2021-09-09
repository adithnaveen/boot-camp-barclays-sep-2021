package com.barclays.employee.dao;

import com.barclays.contracts.ICustomerDAO;
import com.barclays.contracts.IEmployeeDAO;

public class EmployeeDaoJDBCImpl implements IEmployeeDAO{

	@Override
	public void saveEmployee() {
		System.out.println("saveEmployee()-EmployeeDaoJDBCImpl");
	}

 
}
