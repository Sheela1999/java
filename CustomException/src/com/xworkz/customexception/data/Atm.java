package com.xworkz.customexception.data;

import com.xworkz.customexception.custom.BalanceNotFoundException;
import com.xworkz.customexception.custom.InsufficientBalanceException;
import com.xworkz.customexception.custom.InvalidLanguageException;
import com.xworkz.customexception.custom.InvalidPinException;
import com.xworkz.customexception.custom.InvalidUserPin;

public class Atm {

	public static void withdrawMoney(long pin, int userPin) throws InvalidPinException, InvalidUserPin {
		if (pin >= 8999 && userPin >= 8999) {
			System.out.println("PIN is valid");

			if (userPin == pin) {
				System.out.println("userPin is valid");
				return;
			}
			throw new InvalidUserPin("user pin not valid");
			// System.out.println("user pin is not valid");
		}
		throw new InvalidPinException("pin not valid");
		// System.out.println("pin is not valid");

	}

	public static boolean checkBalance(String language, int balance)
			throws InvalidLanguageException, BalanceNotFoundException {
		if (language != null) {
			System.out.println("given language is valid");

			if (balance == 50000) {
				System.out.println("checking balance is found");
				return true;
			}
			throw new InvalidLanguageException("language not valid");
//			System.out.println("language  not valid");
//			return false;

		}
		throw new BalanceNotFoundException("balance not found");
//		System.out.println("balance not found");
//		return false;

	}

	public static void withdrawAmount(int amount, long balance) throws InsufficientBalanceException {
		if (amount <= balance) {
			System.out.println("remove card");
			System.out.println("wait for cash");
			return;
		} else {
			throw new InsufficientBalanceException("Insufficient balance");
		}
	}

}
