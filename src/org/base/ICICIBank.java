package org.base;

public class ICICIBank {

	private void saveings(String persent) {
		System.out.println("ICICIBank saveings persent is:" + persent);

	}

	private void saveings(String persent, String persent1) {
		this.saveings("2.3%", "7.9%", 'P');
		
		System.out.println("ICICIBank deposite persent is:" + persent + "\t to lt" + persent1);

	}

	private void saveings(String persent, String persent2, char P) {
		
		System.out.println("ICICIBank finalamount persent is:" + persent + "\t to \t" + persent2+"\t for \t"+'P');

	}

	public static void main(String[] args) {
		ICICIBank ICICI = new ICICIBank();
		ICICI.saveings("6.4%");
		ICICI.saveings("9.8%", "13.8%");
		ICICI.saveings("2.3%", "7.9%", 'P');
	}

}
