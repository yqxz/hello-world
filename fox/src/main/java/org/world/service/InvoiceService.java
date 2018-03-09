package org.world.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.world.dao.InvoiceDao;
import org.world.model.Invoice;

public class InvoiceService {
		private InvoiceDao inDao=new InvoiceDao();
		private Logger logger=Logger.getLogger(InStoreService.class);
		
		/**
		 * ���һ����Ʊ�����Ϣ
		 * @param in Invoice��Ķ���
		 * @return  ��ӽ�� true/false
		 */
		public boolean add(Invoice in) {
			int count=0;
			try {
				count=inDao.insert(in);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**
		 * ���ݷ�Ʊ��invId���ض�Ӧ�Ľ��
		 * @param id
		 * @return
		 */
		public double getById(String id) {
			double count=0;
			try {
				count=inDao.query(id);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count;
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
