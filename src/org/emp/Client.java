package org.emp;

import org.base.Employee;

public class Client extends Employee {

	private void clientId() {
		System.out.println("Client id is: 876");

	}
	private void clientName() {
		System.out.println("Client Name is: Amazon");

	}
	public static void main(String[] args) {
		Client a = new Client();
		Employee b= new Employee();
		a.clientId();
		a.clientName();
		b.EmployeeId();
		b.EmployeeName();
		
	}
	
}
