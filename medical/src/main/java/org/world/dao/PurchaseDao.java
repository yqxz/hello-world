package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Purchase;

public class PurchaseDao extends DBManager{
		
		/**
		 * 根据ID查询订单信息
		 * @param id
		 * @return
		 * @throws SQLException
		 */
		public Purchase query(String id) throws SQLException {
			Purchase pur=null;
			String sql="select * from Purchase where purId=?";
			Object[] obs= {id};
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, obs);
			if(rs.next()) {
				pur=new Purchase();
				pur.setPurId(rs.getString("purId"));
				pur.setUserId(rs.getString("userId"));
				pur.setUserName(rs.getString("userName"));
				pur.setSupName(rs.getString("supName"));
				pur.setPurTime(rs.getString("purTime"));
				pur.setVariety(rs.getInt("variety"));
				pur.setTotalNumber(rs.getInt("totalNumber"));
				pur.setTotalMoney(rs.getDouble("totalMoney"));
			}
			this.closeConnection();
			return pur;
		}
		/**
		 * 添加一个采购订单主表的信息
		 * @param pur
		 * @return
		 * @throws SQLException
		 */
		public int insert(Purchase pur) throws SQLException {
			String sql="insert into Purchase values(?,?,?,?,?,?,?,?)";
			Object[] obs= {pur.getPurId(),pur.getUserId(),pur.getUserName(),pur.getSupName(),
					pur.getPurTime(),pur.getVariety(),pur.getTotalNumber(),pur.getTotalMoney()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);	
			this.closeConnection();
			return count;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
