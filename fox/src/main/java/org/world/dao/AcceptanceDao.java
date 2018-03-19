package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
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
		public int insert(Acceptance a) throws SQLException {
			String sql="insert into Acceptance values(?,?,?,?,?,?,?,?)";
			Object[] obs= {a.getAccId(),a.getPurId(),a.getMatId(),a.getMatName(),
							a.getTotalNumber(),a.getBatchNumber(),a.getProDate(),a.getValDate()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		
		
		@SuppressWarnings("all")
		  public String getMaxId() throws SQLException {
		    String sql="select MAX(accId) from acceptance";
		    Connection conn=this.openConnection();
		    ResultSet rs=this.query(conn, sql, null);
		    String count=null;
		    if(rs.next()) {
		      count=rs.getString(1);
		    }
		    this.closeConnection();
		    return count;
		  }
		
		
		
		
		
		
		
		
		
		
		
}
