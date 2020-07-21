package com.acme.bo;

import java.util.List;

public class Employee extends Person{
	// Lab add SSN to Employee, validate it, include in toString
	
	// CJS: Figure out how to include a private method.
	private String employeeId;
	private double salary;
	private String SSN;

	public Employee (String firstName,String lastName, String email, String id, double salary, String SSN) {
		super(firstName, lastName,  email);
		this.setEmployeeId(id);
		this.setSalary(salary);
		this.setSSN(SSN);
	}
	
	public double getDiscount() {
		return .1;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String empoyeeId) {
		this.employeeId = empoyeeId;
	}
	
	@Override
	public String toString() {
		String outPutString = super.toString()+ "Employee Id: " + getEmployeeId() +
				"\n" + "Salary: " + getSalary()+ "\n"  + "SSN: " + getSSN();
		return outPutString ;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		try {
			Integer.parseInt(sSN);
		} catch (NumberFormatException e) {
			throw new RuntimeException("SSN must be numeric [" + sSN +"]");
		}
		if (sSN.length() != 9) {
			throw new RuntimeException("SSN must be 9 digits [" + sSN +"]");
		}
		SSN = sSN;
	}

}
