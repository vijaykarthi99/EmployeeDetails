package org.emp;

import org.base.Employee;

public class Company extends Employee{
	private void CompabyInfo() {
		System.out.println("Company id is: 321");

	}
	private void CompanyName() {
		System.out.println("Company name is: e-comerce");

	}
	public static void main(String[] args) {
		Company a = new Company();
		Employee b = new Employee();
		a.CompabyInfo();
		a.CompanyName();
		b.EmployeeId();
		b.EmployeeName();
	}

}
