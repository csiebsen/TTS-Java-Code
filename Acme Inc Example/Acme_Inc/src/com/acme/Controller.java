package com.acme;

import java.util.ArrayList;
import java.util.List;

import com.acme.bo.Customer;
import com.acme.bo.Employee;
import com.acme.bo.Person;
import com.acme.enums.WorkerTypeEnum;

public class Controller {
	
	List<Customer> customers = new ArrayList<Customer>();
	List<Employee> employees = new ArrayList<Employee>();
	// CJS changet these lists to a single persons list
	List<Person> persons = new ArrayList<Person>();
	
	List<OrderProcessor> allOrders = new ArrayList<OrderProcessor>();
	
	protected void runDemo() {
		loadData();
		showStatus();
		
	}
	private void loadData() {
		Customer cust1 = new Customer("Joe","Namath","joe@gmail.com", "123");
		cust1.setWorkerTypeEnum(WorkerTypeEnum.FULL_TIME);
		customers.add(cust1);
		Customer cust2 = new Customer("Michael","Jordan","dunk@gmail.com", "124");
		cust1.setWorkerTypeEnum(WorkerTypeEnum.PART_TIME);
		customers.add(cust2);
		Customer cust3 = new Customer("Hank","Aaron","slugger@gmail.com", "125"); 
		customers.add(cust3);
		
		Employee emp1 = new Employee("Danny","Devitto", "DD@Yahoo.com","A123",123213.23,"142231234");
		employees.add(emp1);
		Employee emp2 = new Employee("Arnold","Schwarzeneger", "Arnie@Yahoo.com","B234",223213.23,"321323214");
		employees.add(emp2);
		
		persons.addAll(customers);
		persons.addAll(employees);
		
		allOrders.addAll(persons);
		// add some orders
		for(OrderProcessor op:allOrders) {
			op.addOrder(100);
			op.addOrder(100);
			op.addOrder(100);
			op.addOrder(100);
			op.addOrder(100);
		}
		
	}
	private void showStatus() {

		for(OrderProcessor orderProcessor:allOrders) {
			System.out.println(orderProcessor.getTotalPurchaseAmount());
		}
		for(Person person:persons) {
			System.out.println("----------------------------");
			System.out.println(person.toString());
		}

//		for(Customer customer:customers) {
//			System.out.println("----------------------------");
//			System.out.println(customer.toString());
//		}
//		System.out.println("==================================");
//		for(Employee employee:employees) {
//			System.out.println(employee.toString());
//			System.out.println("----------------------------");
//			
//		}
	}
}
