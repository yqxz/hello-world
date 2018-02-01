package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Acceptdetial;

public class AcceptdetialDao extends DBManager{

	/**
	 * ���һ��������ϸ����Ϣ
	 * @param acc
	 * @return
	 * @throws SQLException
	 */
		public int insert(Acceptdetial acc) throws SQLException {
			String sql="insert into Acceptdetial values(?,?,?,?,?,?,?)";
			Object[] obs= {acc.getAccId(),acc.getPurId(),acc.getMatId(),acc.getMatName(),
							acc.getProDate(),acc.getValDate(),acc.getAccNumber()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		/**
		 * ��ѯ�����Ĳɹ������ܵĵ�����
		 * @param purId
		 * @return
		 * @throws SQLException
		 */
		public int queryAccNumber(String purId) throws SQLException {
			String sql="select sum(accNumber) from Acceptdetial where purId=?";
			Object[] obs= {purId};
			Connection conn=this.openConnection();
			int count=0;
			ResultSet rs=this.query(conn, sql, obs);
			if(rs.next()) {
				count=rs.getInt(1);
			}
			this.closeConnection();
			return count;
		}
		
		
		
		
		
		
		
		
		
		
}
