package org.emp;

import org.base.CitiBank;

public class UnionBank implements CitiBank {

	@Override
	public void savings() {
		System.out.println("UnionBank saving persent: 9.3%");
		
	}

	@Override
	public void deposite() {
		System.out.println("UnionBank deposite persent: 4.6%");
		
	}

	@Override
	public void fixed() {
		System.out.println("UnionBank fixed persent: 8.2%");
		
	}
	public static void main(String[] args) {
		UnionBank u = new UnionBank();
		u.savings();
		u.deposite();
		u.fixed();
	}
	

}
