package main;

import java.math.BigDecimal;
import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ATM Atm = new ATM(500, "2494");
	
		String setPin = Atm.getPin();
		
	
		
		 BigDecimal newBalance = new BigDecimal(Atm.getBalance());

		
		 
		 
		 
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

		int userOption = 0;
		System.out.println("Congrats you entered the correct pin!\n");
		System.out.println("Welcome to We Can Code It Bank!");
		while(enteredPin.equals(setPin) && userOption != 4) {
			displayOptions();
			userOption = input.nextInt();
			if(userOption == 1) {
				System.out.println("How much would you like to deposit?");
				double depositAmount = input.nextDouble();
				Atm.deposit(depositAmount);
			}else if(userOption == 2) {
				System.out.println("How much would you like to withdraw");
				double withdrawAmount = input.nextDouble();
				Atm.withdraw(withdrawAmount);
			}else if(userOption == 3) {
				System.out.println("Your current balance is " + Atm.getBalance());
			}
			else if(userOption == 4) {
				System.out.println("Thank you for choosing We Can Code It Bank!");
				break;
			}
			else {
				System.out.println("Please choose from 1-4");
			}
		
		
		}
		
		
		input.close();
	}
	
	
	
	
	
	
	public static void displayOptions() {
		System.out.println("Choose an option.\r\n" + 
				"Press 1 to deposit funds.\r\n" + 
				"Press 2 to withdraw funds.\r\n" + 
				"Press 3 to check balance.\r\n" + 
				"Press 4 to exit.");
	}
	
	
	
	
	
	
	

}
