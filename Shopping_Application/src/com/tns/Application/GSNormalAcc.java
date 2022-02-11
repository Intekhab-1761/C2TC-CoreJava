package com.tns.Application;


import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{

		System.out.println("Dear user your product has been booked"
				+ "\n"
				+ "Total amount: "+charges+" Delivery charge: "+getDeliveryCharges());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + accNo + ", charges=" + charges + ", toString()=" + super.toString()
				+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}