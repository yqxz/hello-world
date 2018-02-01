package org.world.service;

import org.world.entity.Purchase;
import org.world.entity.Purchasedetial;

public class Test {
	public static void main(String[] args) {
		boolean bool=false;
		PurchaseService pds=new PurchaseService();
		Purchase p=new Purchase ();
		p.setPurId("1");
		p.setUserId("123");
		p.setUserName("123");
		p.setSupName("123");
		p.setPurTime("2017");
		p.setVariety(3);
		p.setTotalNumber(5);
		p.setTotalMoney(60);
		bool=pds.addPurchase(p);
		System.out.println(bool);
		
	}

}
