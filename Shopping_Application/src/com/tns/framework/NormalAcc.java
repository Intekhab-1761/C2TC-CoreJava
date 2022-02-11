package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	public void bookProduct(float deliveryCharges) {

	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharges + ", accNo=" + accNo + ", accNm=" + getAccNm()
				+ ", charges=" + charges + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

}
