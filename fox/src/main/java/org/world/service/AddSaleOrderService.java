package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.AddSaleOrderDao;
import org.world.model.Saleorder;
import org.world.model.Saleorderdetial;

public class AddSaleOrderService {
	private AddSaleOrderDao soad = new AddSaleOrderDao();
	//销售订单添加主表
	public boolean saleOrderAdd(List<Saleorder> saleOrderList) {
		int count =0;
		for(int i =0;i<saleOrderList.size();i++) {
			try {
				soad.addSaleOrder(saleOrderList.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			count++;
		}
		return count>0?true:false;
	}
	
	//销售订单添加明细表
	public boolean saleOrderdetialAdd(List<Saleorderdetial> saleOrderdetialList) {
		int count =0;
		for(int i =0;i<saleOrderdetialList.size();i++) {
			try {
				soad.addSaleOrderdetial(saleOrderdetialList.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			count++;
		}
		return count>0?true:false;
	}
	
	    /**
	   * 获得最大主键值
	   * @return
	   */
	  public String getMaxId() {
	    String count=null;
	    try {
	      count=soad.getMaxId();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    return count;
	  }

}
