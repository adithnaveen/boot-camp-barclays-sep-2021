package com.dao.impl;

import com.dao.contracts.IProductDAO;

public class JDBCProductDAO implements IProductDAO{

	@Override
	public void save() {
		System.out.println("JDBC-Save");
	}

	@Override
	public void delete() {
		System.out.println("JDBC-Delete");
	}
	
}
