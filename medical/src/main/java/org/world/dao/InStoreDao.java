package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.InStore;

public class InStoreDao extends DBManager{
		
		/**
		 * ���һ����ⵥ�������Ϣ
		 * @param in
		 * @return
		 * @throws SQLException
		 */
		public int insert(InStore in) throws SQLException {
			String sql="insert into InStore values(?,?,?,?,?,?,?,?)";
			Object[] obs= {in.getInStoreId(),in.getRepName(),in.getVariety(),in.getTotalNumber(),
							in.getInStoreDate(),in.getUserId(),in.getUserName(),in.getTotalMoney()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
}
