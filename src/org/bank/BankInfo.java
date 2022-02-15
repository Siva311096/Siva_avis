package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
System.out.println("savings account amount in bank is 50 lakh");
	}
	private void fixed() {
System.out.println("fixed account amount in bank is 50 lakh ");
	}
	
	public static void main(String[] args) {
		BankInfo a = new BankInfo ();
		a.deposit();
		a.saving();
		a.fixed();
	}

}
