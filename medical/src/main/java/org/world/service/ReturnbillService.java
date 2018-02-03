package org.world.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.world.dao.ReturnbillDao;
import org.world.model.Returnbill;

public class ReturnbillService {
		private ReturnbillDao retDao=new ReturnbillDao();
		private Logger logger=Logger.getLogger(ReturnbillService.class);
		
		/**
		 * 添加一条原料退货主表的信息
		 * @param ret
		 * @return
		 */
		public boolean add(Returnbill ret) {
			int count=0;
			try {
				count=retDao.insert(ret);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
}
