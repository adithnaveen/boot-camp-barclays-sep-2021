package com.dao.impl;

import com.dao.contracts.IProductDAO;

public class MongoProductDAO implements IProductDAO{

	@Override
	public void save() {
		System.out.println("Mongo-Save");
	}

	@Override
	public void delete() {
		System.out.println("Mongo-Delete");
	}

}
