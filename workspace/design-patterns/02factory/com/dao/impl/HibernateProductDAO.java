package com.dao.impl;

import com.dao.contracts.IProductDAO;

public class HibernateProductDAO implements IProductDAO{

	@Override
	public void save() {
		System.out.println("Hibernate-Save");
	}

	@Override
	public void delete() {
		System.out.println("Hibernate-Delete");
	}
	
}
