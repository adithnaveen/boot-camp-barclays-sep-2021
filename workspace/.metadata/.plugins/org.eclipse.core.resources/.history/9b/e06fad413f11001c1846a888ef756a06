package com.barclays.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

import com.barclays.contracts.ICustomerDAO;
import com.barclays.contracts.IEmployeeDAO;
import com.dao.contracts.IProductDAO;

// this class shall have the contracts for choosing which 
// type of factory to be returned 
public abstract class DaoFactory {

	static class Holder {
		private static DaoFactory instance = null; 
		
		static {
			ResourceBundle bundle = ResourceBundle.getBundle("application"); 
			String factoryImplClass = bundle.getString("dao.factory");
			try {
				instance = (DaoFactory) 
						Class.forName(factoryImplClass).getDeclaredConstructor().newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static DaoFactory getInstance() {
		return Holder.instance; 
	}
	
	public abstract IEmployeeDAO getEmployeeDao();
	public abstract ICustomerDAO getCustomerDao();
	public abstract IProductDAO getProductDao();
	
}
