package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DBMessage.DBUtil;
import com.entity.Prostore;




public class ProstoreDao extends DBUtil {

	public Prostore loadById(int ProstoreId)throws SQLException{
		Prostore p=null;
		String sql="select * from prostore where ProstoreId=?";
		Object[] obs= {ProstoreId};
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, obs);
		if(rs.next()) {
			p=new Prostore();
			p.setProId(rs.getString("proId"));
			p.setDrugId(rs.getString("drugid"));
			p.setDrugName(rs.getString("drugName"));
			p.setRepId(rs.getString("repId"));
			p.setRepName(rs.getString("repName"));
			p.setInProDate(rs.getString("inProDate"));
			p.setApprovalNum(rs.getString("approvalNum"));
			p.setMetering(rs.getString("metering"));
			p.setProSpec(rs.getString("proSpec"));
			p.setProCategory(rs.getString("proCategory"));
			p.setProNumber(rs.getInt("proNumber"));
			p.setProDate(rs.getString("proDate"));
			p.setValDate(rs.getString("valDate"));
			p.setExtantNum(rs.getInt("extantNum"));
		}
		this.clossConnection(conn);
		return p;
	}
	public List<Prostore> loadAll()throws SQLException{
		List<Prostore> prostoreList=new ArrayList<Prostore>();
		Connection conn=this.openConnection();
		String sql="select * from prostore";
		ResultSet rs=this.query(conn, sql, null);
		while(rs.next()) {
			Prostore p=new Prostore();
			p.setProId(rs.getString("proId"));
			p.setDrugId(rs.getString("drugid"));
			p.setDrugName(rs.getString("drugName"));
			p.setRepId(rs.getString("repId"));
			p.setRepName(rs.getString("repName"));
			p.setInProDate(rs.getString("inProDate"));
			p.setApprovalNum(rs.getString("approvalNum"));
			p.setMetering(rs.getString("metering"));
			p.setProSpec(rs.getString("proSpec"));
			p.setProCategory(rs.getString("proCategory"));
			p.setProNumber(rs.getInt("proNumber"));
			p.setProDate(rs.getString("proDate"));
			p.setValDate(rs.getString("valDate"));
			p.setExtantNum(rs.getInt("extantNum")); 
		}
		this.clossConnection(conn);
		return prostoreList;
	}
	
	/**
	 * �ִ���
	 * @return
	 * @throws SQLException
	 */
	public List<Prostore> extantNum()throws SQLException{
		List<Prostore> prostoreList=new ArrayList<Prostore>();
		Connection conn=this.openConnection();
		String sql="select * from prostore order by extantNum";
		ResultSet rs=this.query(conn, sql, null);
		while(rs.next()) {
			Prostore p=new Prostore();
			p.setProId(rs.getString("proId"));
			p.setDrugId(rs.getString("drugid"));
			p.setDrugName(rs.getString("drugName"));
			p.setRepId(rs.getString("repId"));
			p.setRepName(rs.getString("repName"));
			p.setInProDate(rs.getString("inProDate"));
			p.setApprovalNum(rs.getString("approvalNum"));
			p.setMetering(rs.getString("metering"));
			p.setProSpec(rs.getString("proSpec"));
			p.setProCategory(rs.getString("proCategory"));
			p.setProNumber(rs.getInt("proNumber"));
			p.setProDate(rs.getString("proDate"));
			p.setValDate(rs.getString("valDate"));
			p.setExtantNum(rs.getInt("extantNum")); 
			prostoreList.add(p);
		}
		this.clossConnection(conn);
		return prostoreList;
	}
	public List<Prostore> inProDate()throws SQLException{
		List<Prostore> prostoreList=new ArrayList<>();
		Connection conn=this.openConnection();
		String sql="select * from prostore order by inProDate";
		ResultSet rs=this.query(conn, sql, null);
		while(rs.next()) {
			Prostore p=new Prostore();
			p.setProId(rs.getString("proId"));
			p.setDrugId(rs.getString("drugid"));
			p.setDrugName(rs.getString("drugName"));
			p.setRepId(rs.getString("repId"));
			p.setRepName(rs.getString("repName"));
			p.setInProDate(rs.getString("inProDate"));
			p.setApprovalNum(rs.getString("approvalNum"));
			p.setMetering(rs.getString("metering"));
			p.setProSpec(rs.getString("proSpec"));
			p.setProCategory(rs.getString("proCategory"));
			p.setProNumber(rs.getInt("proNumber"));
			p.setProDate(rs.getString("proDate"));
			p.setValDate(rs.getString("valDate"));
			p.setExtantNum(rs.getInt("extantNum")); 
			prostoreList.add(p);
		}
		this.clossConnection(conn);
		return prostoreList;
	}
}
