package com.tns.client;

import com.tns.Application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {
	
	private static ShopFactory factory;
	private static NormalAcc normalAcc;
	private static PrimeAcc primeAcc;
	public static void main(String[] args) {
		
		factory = new GSShopFactory();
		normalAcc=factory.getNewNormalAccount(101, "Intekhab", 1000, 50);
		normalAcc.bookProduct(500);
		
		primeAcc=factory.getNewPrimeAccount(102, "Amit", 3000, false);
		primeAcc.bookProduct(700);
		
		System.out.println(normalAcc.toString());
		System.out.println(primeAcc.toString());
	}

}
