package com.kelly_ann.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
public class ShoppingCartSessionImpl implements ShoppingCartSession {
	
	private List<String> items;
	
	public ShoppingCartSessionImpl() {
		this.items = new ArrayList<>();
	}
	
	@Override
	public void addItem(String newItem) {
		this.items.add(newItem);
	}
	
	@Override
	public List<String> getCartContents() {
		return this.items;
	}
	
	// the @Remove annotation tells WildFly/JBoss to destroy this Stateful EJB 
	// when this method has completed running.
	@Override
	@Remove
	public void checkout() {
		//add items to a database
		System.out.println("This remote, stateful EJB of hash # (" + this.hashCode() + ") will now be destroyed.");
	}
	
}
