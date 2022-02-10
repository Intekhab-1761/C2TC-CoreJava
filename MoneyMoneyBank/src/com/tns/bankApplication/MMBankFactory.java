package com.tns.bankApplication;

import com.tns.bankFramework.BankFactory;
import com.tns.bankFramework.CurrentAcc;
import com.tns.bankFramework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		
		return  new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		
		return new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
	}

	@Override
	public String toString() {
		return "MMBankFactory [toString()=" + super.toString() + "]";
	}
	
	
}
