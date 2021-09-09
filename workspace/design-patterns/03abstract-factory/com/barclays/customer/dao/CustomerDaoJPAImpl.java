package com.barclays.customer.dao;

import com.barclays.contracts.ICustomerDAO;

public class CustomerDaoJPAImpl implements ICustomerDAO{

	@Override
	public void saveCustomer() {
		System.out.println("saveCustomer()-CustomerDaoJPAImpl");
	}

}
