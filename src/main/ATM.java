package main;

public class ATM {

	private double balance;
	private String requiredPin;



	public ATM(double balance, String requiredPin) {
		this.balance = balance;
		this.requiredPin = requiredPin;

	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			balance -= balance;
		} else {
			balance -= amount;
		}

	}

	public void deposit(double amount) {
		balance += amount;

	}

	public boolean AllowAccess(String enteredPin) {
		if (enteredPin.equals(requiredPin)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public String getPin() {
		return requiredPin;
	}
	
	
}
