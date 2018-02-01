package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Invoice;

public class InvoiceDao extends DBManager{
			//	private String invId;
			//	private String invType;
			//	private String  incDate;
			//	private String taxRate;
			//	private String currency;
			//	private String supName;
			//	private String serType;
			//	private String userId;
			//	private String userName;
			//	private String userPower;
			//	private String purId;
			//	private double totalmoney;
		
		/**
		 * 添加一条发票表的信息
		 * @param in
		 * @return
		 * @throws SQLException
		 */
		public int insert(Invoice in) throws SQLException {
			String sql="insert into Invoice values(?,?,?,?,?,?,?,?,?,?,?,?)";
			Object[] obs= {in.getInvId(),in.getInvType(),in.getIncDate(),in.getTaxRate(),
							in.getSupName(),in.getCurrency(),in.getSupName(),in.getSerType(),
							in.getUserId(),in.getUserName(),in.getPurId(),in.getTotalmoney()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			return count;
		}
		
		/**
		 * 根据发票号innId返回对应的金额
		 * @param id
		 * @return
		 * @throws SQLException
		 */
		public double query(String id) throws SQLException {
			String sql="select totalMoney from Invoice where invId=?";
			Object[] obs= {id};
			Connection conn=this.openConnection();
			double count=0;
			ResultSet rs=this.query(conn, sql, obs);
			if(rs.next()) {
				count=rs.getDouble(1);
			}
			return count;
		}
		
		
		
		
		
}
