package com.redondo.spring.springcore.assignment;

import java.util.List;

public class ShoppingCart {
	
	@Override
	public String toString() {
		return "ShoppingCart [items=" + item + "]";
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	private List<Item> item;

}
