package com.barclays.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.barclays.contracts.IShoppingCart;
import com.barclays.contracts.PaymentStratergy;
import com.barclays.entiry.Item;
import com.barclays.paymentmodes.CreditCard;
import com.barclays.paymentmodes.UPI;
import com.barclays.shopping.payments.BestPayment;

public class ShoppingCart implements IShoppingCart{

	private List<Item> items; 
	
	public ShoppingCart() {
		this.items = new ArrayList<Item>(); 
	}
	
	
	@Override
	public void addItem(Item item) {
		this.items.add(item);
	}

	@Override
	public void removeItem(Item item) {
		this.items.remove(item); 
	}

	@Override
	public int calculateTotal(PaymentStratergy paymentStratergy) {
		int sum = 0;
		for(Item item : items) {
			sum += item.getPrice() * item.getCount(); 
		}
		
		if(paymentStratergy instanceof CreditCard) {
			double charges = (CreditCard.getCharges()*sum) /100;
			System.out.println("Credit Cart Payment Charges : "+ charges);
			sum += charges; 
		}else if(paymentStratergy instanceof UPI) {
			double charges = (UPI.getCharges() * sum)/100; 
			System.out.println("UPI Charges : " + charges);
			sum += charges;
		}
		return sum; 
	}

	@Override
	public void checkOut() {
		PaymentStratergy ps = new BestPayment().bestPay(); 
		ps.pay(calculateTotal(ps));
	}

}
