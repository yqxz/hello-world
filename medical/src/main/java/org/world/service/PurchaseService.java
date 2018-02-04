package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.PurchaseDao;
import org.world.entity.Purchase;
import org.world.entity.Purchasedetial;
//采购订单主表添加主表
public class PurchaseService {
	PurchaseDao pd=new PurchaseDao();
	public int addPurchase(List<Purchase> purList) {
		int count=0;
		for(int i=0;i<purList.size();i++) {
			try {
				pd.addPurchase(purList.get(i));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
		return count;
	}

}
