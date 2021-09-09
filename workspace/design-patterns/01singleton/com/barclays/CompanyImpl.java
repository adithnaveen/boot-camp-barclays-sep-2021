package com.barclays;

public class CompanyImpl {
	public static void main(String[] args) {
		// this does not work 
//		Company c = new Company();
		
		Company company = null; 
		
		company = Company.getInstance(company); 
		System.out.println(company.hashCode());
		
		Company company1 = Company.getInstance(company); 
		System.out.println(company1.hashCode());
		
	}
}
