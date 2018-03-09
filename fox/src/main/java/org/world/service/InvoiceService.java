package org.world.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.world.dao.InvoiceDao;
import org.world.model.Invoice;

public class InvoiceService {
		private InvoiceDao inDao=new InvoiceDao();
		private Logger logger=Logger.getLogger(InStoreService.class);
		
		/**
		 * 添加一条发票表的信息
		 * @param in Invoice类的对象
		 * @return  添加结果 true/false
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
		 * 根据发票号invId返回对应的金额
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
