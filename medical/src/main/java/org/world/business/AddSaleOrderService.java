package org.world.business;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.AddSaleOrderDao;
import org.world.model.Saleorder;
import org.world.model.Saleorderdetial;

public class AddSaleOrderService {
	private AddSaleOrderDao soad = new AddSaleOrderDao();
	//���۶����������
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
	
	//���۶��������ϸ��
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
