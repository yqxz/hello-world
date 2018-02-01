package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Acceptance;

public class AcceptanceDao extends DBManager{
		
	/**
	 * ���һ��������������Ϣ
	 * @param acc  Acceptance��һ������
	 * @return   ��Ӱ������
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
