package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Acceptance;

public class AcceptanceDao extends DBManager{
		
	/**
	 * 添加一条到货单主表信息
	 * @param acc  Acceptance的一个对象
	 * @return   受影响行数
	 * @throws SQLException
	 */
		public int insert(Acceptance acc) throws SQLException {
			String sql="insert into Acceptance values(?,?,?,?,?,?,?)";
			Object[] obs= {acc.getAccId(),acc.getAccDate(),acc.getVariety(),acc.getTotalNumber(),
							acc.getBatchNumber(),acc.getOriginNumber(),acc.getAskTime()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
