package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.PurchaseDao;
import org.world.model.Purchase;
import org.world.model.Purchasedetial;
//�ɹ����������������
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
	//��Ӳɹ���ϸ����Ϣ
		
		public int addPurchasedetial(List<Purchasedetial> purdList) {
			int count=0;
			for (int i = 0; i <purdList.size(); i++) {
			
					try {
						pd.addPurchasedetial(purdList.get(i));
					} catch (SQLException e) {
						e.printStackTrace();
					}
					count++;
				
			}
			return count;
		}


}
