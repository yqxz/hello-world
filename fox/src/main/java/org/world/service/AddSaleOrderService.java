package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.AddSaleOrderDao;
import org.world.model.Saleorder;
import org.world.model.Saleorderdetial;

public class AddSaleOrderService {
	private AddSaleOrderDao soad = new AddSaleOrderDao();
	//销售订单添加主表
	public int saleOrderAdd(List<Saleorder> saleOrderList) {
		int count =0;
		for(int i =0;i<saleOrderList.size();i++) {
			try {
				soad.addSaleOrder(saleOrderList.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			count++;
		}
		return count;
	}
	
	//销售订单添加明细表
	public int saleOrderdetialAdd(List<Saleorderdetial> saleOrderdetialList) {
		int count =0;
		for(int i =0;i<saleOrderdetialList.size();i++) {
			try {
				soad.addSaleOrderdetial(saleOrderdetialList.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			count++;
		}
		return count;
	}

}
