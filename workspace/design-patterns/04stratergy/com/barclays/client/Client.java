package com.barclays.client;

import com.barclays.contracts.IShoppingCart;
import com.barclays.entiry.Item;
import com.barclays.shoppingcart.ShoppingCart;

public class Client {
	public static void main(String[] args) {
		IShoppingCart cart = new ShoppingCart(); 
		cart.addItem(new Item("Mobile", 1000, 3));
		cart.addItem(new Item("KeyBoard", 34, 1));
		cart.addItem(new Item("Presenter", 89, 1));
		
		
		cart.checkOut();
	}
}
