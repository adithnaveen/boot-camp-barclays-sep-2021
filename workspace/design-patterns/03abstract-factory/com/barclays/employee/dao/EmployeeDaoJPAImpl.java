package com.barclays.employee.dao;

import com.barclays.contracts.ICustomerDAO;
import com.barclays.contracts.IEmployeeDAO;

public class EmployeeDaoJPAImpl implements IEmployeeDAO{

	@Override
	public void saveEmployee() {
		System.out.println("saveEmployee()-EmployeeDaoJPAImpl");
	}

 
}
