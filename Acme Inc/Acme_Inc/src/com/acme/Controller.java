package com.acme;

import java.util.ArrayList;
import java.util.List;

import com.acme.bo.Customer;
import com.acme.bo.Employee;
import com.acme.bo.Person;
import com.acme.enums.WorkerType;

public class Controller {

	List<Customer> customerList = new ArrayList<Customer>();
	List<Employee> employees = new ArrayList<Employee>();
	
	List<Person> persons = new ArrayList<Person>();
	
	public void runDemo() {
		loadData();
		showStatus();
	}
	
	private void loadData() {
		Customer customer1 = new Customer("Arnold","Schwarzeneger","pump@yaoo.com","12345");
		customerList.add(customer1);
		Customer customer2 = new Customer("Joe","Nammath","Joe@yaoo.com","5346");
		customerList.add(customer2);
		Customer customer3 = new Customer("Michael","Jordan","Mike@yaoo.com","3856");
		customerList.add(customer3);
		
		Employee emp1 = new Employee("Danny","Devitto", "DD@Yahoo.com","123",123213.23,"142231234");
		emp1.setWorkerType(WorkerType.CONTRACTOR);
		employees.add(emp1);
		Employee emp2 = new Employee("Arnold","Schwarzeneger", "Arnie@Yahoo.com","234",223213.23,"321323214");
		emp2.setWorkerType(WorkerType.SEASONAL);
		employees.add(emp2);		
		Employee emp3 = new Employee("Benny","Goodman", "bg@Yahoo.com","234",553213.23,"111323214");
		emp3.setWorkerType(WorkerType.FULL_TIME);
		employees.add(emp3);

		persons.addAll(customerList);
		persons.addAll(employees);
		
	}
	
	private void showStatus() {
		
		for (Person person:persons) {
			System.out.println("--------------------------");
			System.out.println(person.toString());
		}

//		for (Customer customer:customerList) {
//			System.out.println("--------------------------");
//			System.out.println(customer.toString());
//		}
//		System.out.println("==========================");
//		System.out.println("==================================");
//		for(Employee employee:employees) {
//			System.out.println(employee.toString());
//			System.out.println("----------------------------");
//			
//		}

	}
	
}
