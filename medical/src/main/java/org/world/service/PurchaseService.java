package org.world.service;

import java.sql.SQLException;

import org.world.dao.PurchaseDao;
import org.world.entity.Purchase;
//采购订单主表添加主表
public class PurchaseService {
	PurchaseDao pd=new PurchaseDao();
  public boolean addPurchase(Purchase p) {
	  boolean bool=false;
	  int count=0;
	try {
		count = pd.addPurchase(p);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return count>0?true:false;
	  
	 
  }

}
