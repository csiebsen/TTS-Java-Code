package com.acme.bo;

public class Customer extends Person{

	private String customerId;

	public Customer (String firstName,String lastName, String email, String id) {
		super(firstName, lastName,  email);
		this.setCustomerId(id);
	}
	
	public double getDiscount() {
		return .05;
	}
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * Customer id must be numeric
	 * @param customerId -
	 */
	public void setCustomerId(String customerId) {
		try {
			Integer.parseInt(customerId);
		} catch (NumberFormatException e) {
			throw new RuntimeException("Customer ID must be numeric [" + customerId +"]");
		}

		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		String outPutString = super.toString();
		return outPutString + "Customer Id: " + getCustomerId();
	}
}
