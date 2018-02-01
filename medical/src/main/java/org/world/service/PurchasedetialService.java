package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.world.dao.PurchasedetialDao;
import org.world.model.Purchasedetial;

public class PurchasedetialService {
		private PurchasedetialDao purDao=new PurchasedetialDao();
		private Logger logger=Logger.getLogger(PurchasedetialService.class);
		
		/**
		 * ����purId��ѯ��Ӧ����
		 * @param id
		 * @return   ָ��purId��һ��Purchasedetial�����ļ���
		 */
		public List<Purchasedetial> getById(String id){
			List<Purchasedetial> purList=null;
			try {
				purList=purDao.queryById(id);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return purList;
		}
		
		/**
		 * �����Ϣ
		 * @param purList  һ��Purchasedetial���͵ļ���
		 * @return  ������ӳɹ�������
		 */
		public int add(List<Purchasedetial> purList) {
			int count=0;
			for (int i = 0; i <purList.size(); i++) {
				try {
					purDao.insert(purList.get(i));
					count++;
				} catch (SQLException e) {
					logger.debug(e);
				}
			}
			return count;
		}
		
		
}
