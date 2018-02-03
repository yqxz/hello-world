package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Paymentapply;

public class PaymentapplyDao extends DBManager{
		
		/**
		 * 添加一条付款申请单数据
		 * @param pay
		 * @return
		 * @throws SQLException
		 */
		public int insert(Paymentapply pay) throws SQLException {
			String sql="insert into Paymentapply values(?,?,?,?,?,?)";
			Object[] obs= {pay.getPayId(),pay.getInvId(),pay.getTotalMoney(),pay.getUserId(),
							pay.getUserName(),pay.getPayDate()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}		
}
