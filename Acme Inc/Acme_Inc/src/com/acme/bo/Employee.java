package com.acme.bo;

import com.acme.enums.WorkerType;

public class Employee extends Person{
	
	private String employeeId;
	private double salary;
	private String ssn;
	private WorkerType workerType;

	public Employee(String firstName, String lastName, String email, String employeeId, double salary, String ssn) {

		super(firstName,lastName,email);
		this.setEmployeeId(employeeId);
		this.setSalary(salary);
		this.setSsn(ssn);
	}
	
	public WorkerType getWorkerType() {
		return workerType;
	}

	public void setWorkerType(WorkerType workerType) {
		this.workerType = workerType;
	}

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {

		try {
			Integer.parseInt(employeeId);
		} catch (NumberFormatException e) {
			throw new RuntimeException("Emplyee number must be numeric [" + employeeId + "]");
		}

		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		String output = super.toString();
		output = output + "\nId: " + getEmployeeId();
		output = output + "\nSalary: " + getSalary();
		output = output + "\nSSN: " + getSsn();
		output = output + "\nWorker Type: " + getWorkerType();
		return output;
	}
	
}
