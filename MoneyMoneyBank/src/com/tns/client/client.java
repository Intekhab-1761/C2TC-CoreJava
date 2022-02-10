package com.tns.client;

import com.tns.bankApplication.MMBankFactory;
import com.tns.bankFramework.BankFactory;
import com.tns.bankFramework.CurrentAcc;
import com.tns.bankFramework.SavingAcc;

public class client {

	private static BankFactory factory;
	private static SavingAcc savingAcc;
	private static CurrentAcc currentAcc;

	public static void main(String[] args) {

		factory = new MMBankFactory();
		savingAcc = factory.getNewSavingAcc(101, "Amit", 10000f, false);
		savingAcc.withdraw(20000);
		System.out.println("Your Account balance is "+savingAcc.getAccBal());

		currentAcc = factory.getNewCurrentAcc(102, "Amit", 9000f, 500f);
		currentAcc.withdraw(200);
		System.out.println("Your Account balance is "+currentAcc.getAccBal());
		
		System.out.println(currentAcc.toString());
		System.out.println(savingAcc.toString());
	}

}
