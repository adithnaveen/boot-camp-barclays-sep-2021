package com.dao.factory;

import java.util.ResourceBundle;

import com.dao.contracts.IProductDAO;
import com.dao.impl.HibernateProductDAO;
import com.dao.impl.JDBCProductDAO;
import com.dao.impl.MongoProductDAO;

public class DaoFactory {
	
	// these type of classes should not be created 
	// directly since they are resource intensive
	
	private DaoFactory() {}
	
	public static IProductDAO getProductDao() {
		ResourceBundle rb = ResourceBundle.getBundle("application");
		String dbSelected = rb.getString("productDao.impl");
		return getProductDao(dbSelected);
	}

	private static IProductDAO getProductDao(String dbSelected) {
		System.out.println("DB Selected : " + dbSelected);
		
		switch (dbSelected) {
		case "mongo":
			return new MongoProductDAO();
			
		case "hibernate":
			return new HibernateProductDAO(); 
			
		case "jdbc":
			return new JDBCProductDAO(); 
		default:
			throw new RuntimeException("Sorry invalid Database" + dbSelected); 
		}
	}
	
	
}
