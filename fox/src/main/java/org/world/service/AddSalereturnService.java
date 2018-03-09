package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.AddSalereturnDao;
import org.world.model.Salereturn;
import org.world.model.Salereturndetial;

public class AddSalereturnService {

	private AddSalereturnDao astd = new AddSalereturnDao();
	   //�����˻��������
	   public int addSalereturn(List<Salereturn> salereturnList) {
		   int count = 0;
		   for(int i= 0;i<salereturnList.size();i++) {
				try {
					astd.addSalereturnDao(salereturnList.get(i));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				   count++;
		   }
		   return count;
	   }

	   //�����˻������ϸ��
	   public int addSalereturndetial(List<Salereturndetial> SalereturndetialList) {
		   int count  = 0;
		   for(int i = 0;i<SalereturndetialList.size();i++) {
				   try {
					astd.addSalereturndetial(SalereturndetialList.get(i));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				   count++;
		   }
		   return count;
	   }
}
