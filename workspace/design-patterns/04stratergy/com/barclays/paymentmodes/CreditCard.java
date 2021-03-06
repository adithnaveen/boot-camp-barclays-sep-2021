package com.barclays.paymentmodes;

import com.barclays.contracts.PaymentStratergy;

public class CreditCard implements PaymentStratergy{

	private String name;
	private String creditCartNumber;
	private int cvv; 
	private String expDate; 
	private static double charges = 2; 
	
	
	public CreditCard() {
		this.name = "Sahil"; 
		this.creditCartNumber ="1234-2345-3434-6654"; 
		this.cvv = 123; 
		this.expDate="06/24"; 
	}
	 
	
	public CreditCard(String name, String creditCartNumber, int cvv, String expDate) {
		super();
		this.name = name;
		this.creditCartNumber = creditCartNumber;
		this.cvv = cvv;
		this.expDate = expDate;
	}

	public static double getCharges() {
		return charges; 
	}
 
	@Override
	public void pay(int amount) {
		 System.out.println("Amount : " + amount  +
				 	" Paying with : " + this.creditCartNumber);
	}

}
