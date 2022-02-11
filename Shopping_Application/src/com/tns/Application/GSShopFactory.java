package com.tns.Application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory 
{

	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		
		return new GSPrimeAcc(AccNo, accNm, charges, isPrime);
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
		
		return new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
	}

	
}

