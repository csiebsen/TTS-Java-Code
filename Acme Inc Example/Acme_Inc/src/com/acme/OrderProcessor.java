package com.acme;

public interface OrderProcessor {

	/**
	 * Add an order
	 */
	public void addOrder(double orderTotal);

	/**
	 * Returns a string of total purchase amount for a order processor
	 */
	public String getTotalPurchaseAmount();
	
	/**
	 * Returns the discount for the order processor
	 */
	public double getDiscount();
}
