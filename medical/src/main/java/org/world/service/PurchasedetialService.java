package org.world.service;

import java.sql.SQLException;

import org.world.dao.PurchasedetialDao;
import org.world.entity.Purchasedetial;

public class PurchasedetialService { 
	//��Ӳɹ���ϸ����Ϣ
	PurchasedetialDao pdd=new PurchasedetialDao();
	public boolean addPurchasedetial(Purchasedetial pd) {
		int count=0;
		try {
			count=pdd.addPurchasedetial(pd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count>0?true:false;
	}
	

}
