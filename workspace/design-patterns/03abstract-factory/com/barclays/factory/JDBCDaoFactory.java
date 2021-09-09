package com.barclays.factory;

import com.barclays.contracts.ICustomerDAO;
import com.barclays.contracts.IEmployeeDAO;
import com.barclays.customer.dao.CustomerDaoJDBCImpl;
import com.barclays.employee.dao.EmployeeDaoJDBCImpl;
import com.dao.contracts.IProductDAO;

public class JDBCDaoFactory extends DaoFactory{

	@Override
	public IEmployeeDAO getEmployeeDao() {
		return new EmployeeDaoJDBCImpl();
	}

	@Override
	public ICustomerDAO getCustomerDao() {
		return new CustomerDaoJDBCImpl();
	}

	@Override
	public IProductDAO getProductDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
