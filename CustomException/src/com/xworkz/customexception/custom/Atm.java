package com.xworkz.customexception.custom;

public class Atm {

	public static void withdrawMoney(long pin, int userPin) throws InvalidPinException, InvalidUserPin {
		if (pin >= 8999 && userPin >= 8999) {
			System.out.println("PIN is valid");

			if (userPin == pin) {
				System.out.println("userPin is valid");
			}
			throw new InvalidUserPin("user pin not valid");
			// System.out.println("user pin is not valid");
		}
		throw new InvalidPinException("pin not valid");
		// System.out.println("pin is not valid");

	}

	public static void checkBalance(String language, int balance) throws InvalidLanguageException, BalanceNotFoundException {
		if(language != null) {
			System.out.println("given language is valid");
			
			if(balance == 50000) {
				System.out.println("checking balance is found");
			}
			throw new InvalidLanguageException("language not valid");
//			System.out.println("language  not valid");

		}
		throw new BalanceNotFoundException("balance not found");
//		System.out.println("balance not found");

	}
	
	public static void withdrawAmount(int amount, long balance) throws InsufficientBalanceException {
		if(amount <= balance) {
			System.out.println("remove card");
			System.out.println("wait for cash");
		}
		throw new InsufficientBalanceException("Insufficient balance");
		//System.out.println("Insufficient balance");
	}

}
