package com.kelly_ann.shoppingcart;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ShoppingCartSession {
	public void addItem(String newItem);
	
	public List<String> getCartContents();
	
	public void checkout();
	
}
