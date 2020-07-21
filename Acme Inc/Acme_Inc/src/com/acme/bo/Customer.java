package com.acme.bo;

public class Customer extends Person{
	
	private String customerId;
	
	public Customer (String firstName,String lastName, String email, String id) {
		super(firstName, lastName,  email);
		this.setCustomerId(id);
	}

	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		String output = super.toString();
		output = output + "\nId: " + getCustomerId();
		return output;
	}
	
}
