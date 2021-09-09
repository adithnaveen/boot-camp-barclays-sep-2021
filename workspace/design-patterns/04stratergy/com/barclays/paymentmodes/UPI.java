package com.barclays.paymentmodes;

import com.barclays.contracts.PaymentStratergy;

public class UPI implements PaymentStratergy{

	private String mobileNumber; 
	private int otp; 
	private static double charges = 1.4; 
	
	public static double getCharges() {
		return charges;
	}
	
	
	public UPI() {
		this.mobileNumber = "9900524255";
		this.otp = 123; 
		
	}
	 
	public UPI(String mobileNumber, int otp) {
		super();
		this.mobileNumber = mobileNumber;
		this.otp = otp;
	}

	@Override
	public void pay(int amount) {
	 System.out.println("Amount "+ amount +", paid using UPI(Mobile Number) :" + mobileNumber);
	}

}
