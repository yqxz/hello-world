package org.world.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.world.dao.PaymentapplyDao;
import org.world.model.Paymentapply;

public class PaymentapplyService {
		private PaymentapplyDao payDao=new PaymentapplyDao();
		private Logger logger=Logger.getLogger(PaymentapplyService.class);
		
		/**
		 * 添加一条付款申请表的信息
		 * @param pay
		 * @return
		 */
		public boolean add(Paymentapply pay) {
			int count=0;
			try {
				count=payDao.insert(pay);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
}
