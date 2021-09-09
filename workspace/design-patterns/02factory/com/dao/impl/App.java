package com.dao.impl;

import com.dao.contracts.IProductDAO;
import com.dao.factory.DaoFactory;

public class App {
	public static void main(String[] args) {
		IProductDAO productDao = DaoFactory.getProductDao();
		
		productDao.save(); 
		productDao.delete();
	}
}
