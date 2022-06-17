package org.base;

public class HDFCBank extends AxisBank {

	@Override
	void savings() {
		System.out.println("HDFCBank savings persent: 7.9%");
	}

	@Override
	void deposite() {
		System.out.println("HDFCBank deposite persent: 5.8%");
		
	}
public static void main(String[] args) {
	HDFCBank a = new HDFCBank();
	a.savings();
	a.deposite();
	a.fixed();
}
	
}
