package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Returnbill;

public class ReturnbillDao extends DBManager{
//			private String retId;
//			private int variety;
//			private int retNumber;
//			private String retDate;
//			private double totalMoney;
//			private String userId;
//			private String userName;
		
		/**
		 * 添加一条原料退货主表的数据
		 * @param ret
		 * @return
		 * @throws SQLException
		 */
		public int insert(Returnbill ret) throws SQLException {
			String sql="insert into Returnbill values(?,?,?,?,?,?,?)";
			Object[] obs= {ret.getRetId(),ret.getVariety(),ret.getRetNumber(),ret.getRetDate(),
							ret.getTotalMoney(),ret.getUserId(),ret.getUserName()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			return count;
		}
}
