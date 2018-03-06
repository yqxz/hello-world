package org.world.business;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.AddSaleoutstoreDao;
import org.world.model.Saleoutstore;
import org.world.model.Sosdetial;


public class AddSaleoutstoreService {

	private AddSaleoutstoreDao asotd = new AddSaleoutstoreDao();
	   //销售出库添加主表
	   public int addSaleoutstore(List<Saleoutstore> SaleoutstoreList) {
		   int count = 0;
		   for(int i= 0;i<SaleoutstoreList.size();i++) {
				try {
					asotd.addsaleoutstore(SaleoutstoreList.get(i));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				   count++;
		   }
		   return count;
	   }

	   //销售出库添加明细表
	   public int addSosdetial(List<Sosdetial> sosdetialList) {
		   int count  = 0;
		   for(int i = 0;i<sosdetialList.size();i++) {
				   try {
					asotd.addsosdetial(sosdetialList.get(i));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				   count++;
		   }
		   return count;
	   }
}
