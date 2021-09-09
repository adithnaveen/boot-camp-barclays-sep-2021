package com.barclays.contracts;

import com.barclays.entiry.Item;

public interface IShoppingCart {
	void addItem(Item item);

	void removeItem(Item item);

	int calculateTotal(PaymentStratergy paymentStratergy);

	void checkOut();
}
