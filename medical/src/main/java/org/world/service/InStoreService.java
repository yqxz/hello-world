package org.world.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.world.dao.InStoreDao;
import org.world.model.InStore;

public class InStoreService {
		private InStoreDao inDao=new InStoreDao();
		private Logger logger=Logger.getLogger(InStoreService.class);
		
		/**
		 * ���һ����ⵥ�������Ϣ
		 * @param in
		 * @return
		 */
		public boolean add(InStore in) {
			int count=0;
			try {
				count=inDao.insert(in);
			} catch (SQLException e) {
				logger.debug(e);			
			}
			return count>0?true:false;
		}
		
}
