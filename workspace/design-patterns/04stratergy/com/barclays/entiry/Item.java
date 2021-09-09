package com.barclays.entiry;

public class Item {
	private String itemName;
	private double price; 
	private int count;
	
	public Item(String itemName, double price, int count) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.count = count;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	} 
	
	
}
