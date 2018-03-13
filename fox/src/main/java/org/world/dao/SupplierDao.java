package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Supplier;

public class SupplierDao extends DBManager{
		
	
	@SuppressWarnings("all")
	public List<Supplier> selectAll() throws SQLException{
		List<Supplier> list=new ArrayList<>();
		String sql="select * from Supplier";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
		while(rs.next()) {
			Supplier s=new Supplier();
			s.setSupId(rs.getInt("supId"));
			s.setSupName(rs.getString("supName"));
			s.setSupAccount(rs.getString("supAccount"));
			s.setSupBank(rs.getString("supBank"));
			s.setSupAddress(rs.getString("supAddress"));
			s.setSupContact(rs.getString("supContact"));
			s.setSupPhone(rs.getString("supPhone"));
			list.add(s);
		}
		this.closeConnection();
		return list;
	}
	
	/**
	 * 数据总数
	 * @return
	 * @throws SQLException
	 */
	public int getCount() throws SQLException {
		String sql="select count(proId) from sppplier";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
		int count=0;
		if(rs.next()) {
			count=rs.getInt(1);
		}
		return count;
	}
	
	@SuppressWarnings("all")
	public List<Supplier> select(int page,int rows) throws SQLException{
		List<Supplier> list=new ArrayList<>();
		String sql="select * from Supplier limit ?,?";
		Connection conn=this.openConnection();
		Object[] obs= {page*rows,rows};
		ResultSet rs=this.query(conn, sql, obs);
		while(rs.next()) {
			Supplier s=new Supplier();
			s.setSupId(rs.getInt("supId"));
			s.setSupName(rs.getString("supName"));
			s.setSupAccount(rs.getString("supAccount"));
			s.setSupBank(rs.getString("supBank"));
			s.setSupAddress(rs.getString("supAddress"));
			s.setSupContact(rs.getString("supContact"));
			s.setSupPhone(rs.getString("supPhone"));
			list.add(s);
		}
		this.closeConnection();
		return list;
	}
}
