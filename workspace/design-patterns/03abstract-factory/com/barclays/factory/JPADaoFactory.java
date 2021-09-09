package com.barclays.factory;

import com.barclays.contracts.ICustomerDAO;
import com.barclays.contracts.IEmployeeDAO;
import com.barclays.customer.dao.CustomerDaoJPAImpl;
import com.barclays.employee.dao.EmployeeDaoJPAImpl;
import com.dao.contracts.IProductDAO;

public class JPADaoFactory extends DaoFactory{

	@Override
	public IEmployeeDAO getEmployeeDao() {
		return new EmployeeDaoJPAImpl(); 
	}

	@Override
	public ICustomerDAO getCustomerDao() {
		return new CustomerDaoJPAImpl();
	}

	@Override
	public IProductDAO getProductDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
