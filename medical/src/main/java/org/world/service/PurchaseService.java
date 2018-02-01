package org.world.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.world.dao.PurchaseDao;
import org.world.model.Purchase;

public class PurchaseService {
		private PurchaseDao purDao=new PurchaseDao();
		private Logger logger=Logger.getLogger(Purchase.class);
		
		/**
		 * 根据purId查询信息
		 * @param id
		 * @return
		 */
		public Purchase get(String id) {
			Purchase pur=null;
			try {
				pur=purDao.query(id);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return pur;
		}
		/**
		 * 添加报表信息
		 * @param pur
		 * @return
		 */
		public boolean add(Purchase pur) {
			int count=0;
			try {
				count=purDao.insert(pur);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
}
