package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.PurchaseGoodsDao;
import org.world.model.PurchaseGoods;
import org.world.model.PurchasedetialGoods;

public class PurchaseGoodsService {
	int count=0;
	PurchaseGoodsDao pgd=new PurchaseGoodsDao();
	//到货主表
	public int addPurchaseGoods(List<PurchaseGoods> goodsList) {
		for(int i=0;i<goodsList.size();i++) {
			try {
				pgd.addPurchaseGoods(goodsList.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			count++;
		}
		return count;
	}
	//到货明细表
	public int addPurchasedetialGoods(List<PurchasedetialGoods> detialGoodsList) {
		int count=0;
		for(int i=0;i<detialGoodsList.size();i++) {
			try {
				pgd.addpurchasedetialGoods(detialGoodsList.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			count++; 
		}
		return count;
		
	}
		
		
	}
	


