package com.barclays.impl;

import com.barclays.contracts.ICustomerDAO;
import com.barclays.contracts.IEmployeeDAO;
import com.barclays.factory.DaoFactory;

public class AbstractFactoryImpl {
	public static void main(String[] args) {
		DaoFactory daoFactory = DaoFactory.getInstance();
		
		
		System.out.println("Factory is instance of :"+ daoFactory.getClass());
		
		
		ICustomerDAO customerDao = daoFactory.getCustomerDao();
		IEmployeeDAO employeeDao = daoFactory.getEmployeeDao();
		
		customerDao.saveCustomer(); 
		
		employeeDao.saveEmployee();
		
		
	}
}
