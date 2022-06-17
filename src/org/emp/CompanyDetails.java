package org.emp;

import org.base.ICICIBank;

public class CompanyDetails {
	private void compInfo(String name ) {
		System.out.println(name);

	}
	private void companyInfo(String ITid,int compid) {
		this.companyInfo(6789765456l, "abc@bca.com", "Chennai");
		System.out.println(ITid+"\t"+compid);
	

	}
	private void companyInfo(long phone,String email,String address) {
		System.out.println(phone+"\n"+ email+"\n"+ address);

	}
	public static void main(String[] args) {
		CompanyDetails a = new CompanyDetails();
		a.compInfo("Alexa");
		a.companyInfo("TN342657", 99980);	
		a.companyInfo(9876655761l, "a123@gami.com", "XXXX/a, YYYY");
	}

}





