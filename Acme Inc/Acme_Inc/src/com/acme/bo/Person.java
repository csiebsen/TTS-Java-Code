package com.acme.bo;

public class Person {

	private String firstName;
	private String lastName;
	private String email;
	
	public Person(String firstName, String lastName, String email) {
		this.setFirstName(firstName);
		this.setLastName(lastName); 
		this.setEmail(email);
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (!email.contains("@") || !email.contains(".")) {
			throw new RuntimeException("Email must have a @ and . character [" + email + "]");
		}
		this.email = email;
	}

	@Override
	public String toString() {
		String output = "";
		output = output + "Name: " + getFirstName() + " " + getLastName();
		output = output + "\nEmail: " + getEmail();
		return output;
	}
	
	

}
