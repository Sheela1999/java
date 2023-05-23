package com.xworkz.customexception;

import com.xworkz.customexception.custom.Atm;
import com.xworkz.customexception.custom.BalanceNotFoundException;
import com.xworkz.customexception.custom.InsufficientBalanceException;
import com.xworkz.customexception.custom.InvalidLanguageException;
import com.xworkz.customexception.custom.InvalidPinException;
import com.xworkz.customexception.custom.InvalidUserPin;

public class CustomExRunner {

	public static void main(String[] args) {
		
		try {
			Atm.withdrawMoney(9009, 9678);
			
			Atm.checkBalance(null, 20000);
			
			Atm.withdrawAmount(5000, 4000);
		}
		
		catch (InvalidPinException | InvalidUserPin e) {
			e.printStackTrace();
		}
		 
	    catch (InvalidLanguageException | BalanceNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}

	}

}
