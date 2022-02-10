package com.tns.bankFramework;

public abstract class SavingAcc extends BankAcc{
	
	private boolean isSalaried;
	private static float MINBAL;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.setSalaried(isSalaried);
		}

	@Override
	public void withdraw(float amount) {
		
		super.withdraw(amount);
		}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public static float getMINBAL() {
		return MINBAL;
	}

	public static void setMINBAL(float mINBAL) {
		MINBAL = mINBAL;
	}
	
	
	
}
