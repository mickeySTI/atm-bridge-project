package main;

import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ATM Atm = new ATM(500, "2494");
	
		String setPin = Atm.getPin();
		

		int attempts = 1;

		System.out.print("Please enter your pin: ");
		String enteredPin = input.next();
		while (!enteredPin.equals(setPin)){
			System.out.println("Sorry that is not the correct PIN, please enter your pin: ");
			enteredPin = input.next();
			attempts++;
			if(attempts ==3) {
				System.out.println("Sorry, we are unable to process your request. Please contact customer service.");
				break;
			}
			
		}

		if (enteredPin.equals(setPin)) {
			System.out.println("Congrats you entered the right pin!");

		}
		input.close();
	}

}
