package com.barclays.shopping.payments;

import com.barclays.contracts.PaymentStratergy;
import com.barclays.paymentmodes.CreditCard;
import com.barclays.paymentmodes.UPI;

public class BestPayment {

	// if you want credit card 
	// name, creditCardNumber, cvv, dateOfEx
	
	// if you want upi 
	// mobileNumber, otp 
	
	public PaymentStratergy bestPay(String ... args) {
		return CreditCard.getCharges() < UPI.getCharges() ? 
				new CreditCard() : new UPI();
	}
	
}
