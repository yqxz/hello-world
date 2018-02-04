package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.PurchasedetialDao;
import org.world.entity.Purchasedetial;

public class PurchasedetialService { 
	//添加采购明细表信息
	PurchasedetialDao pdd=new PurchasedetialDao();
	public int addPurchasedetial(List<Purchasedetial> purdList) {
		int count=0;
		for (int i = 0; i <purdList.size(); i++) {
		
				try {
					pdd.addPurchasedetial(purdList.get(i));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				count++;
			
		}
		return count;
	}

	

}
