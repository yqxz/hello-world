package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.PlanInfo;

public class PlanInfoDao  extends DBManager{
	
	@SuppressWarnings("all")
	public List<PlanInfo> loadPlanInfo() throws SQLException{
		List<PlanInfo> piList=new ArrayList<>();
		String sql="select * from planInfo";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
		while(rs.next()) {
			PlanInfo p=new PlanInfo();
			p.setPlanInfoId(rs.getInt("planInfoId"));
			p.setMatId(rs.getInt("matId"));
			p.setUnitPrice(rs.getDouble("unitPrice"));
			p.setQuantity(rs.getInt("quantity"));
			p.setPlanInfoDate(rs.getString("planInfoDate"));
			p.setLoginName(rs.getString("loginName"));
			p.setStatus(rs.getBoolean("status"));
			piList.add(p);
			}
		this.closeConnection();
		return piList;
	}
	
	/**
	 * 
	 * @param p
	 * @return  添加采购计划信息的结果
	 * @throws SQLException
	 */
	public int insert(PlanInfo p) throws SQLException {
		String sql= "insert into planInfo values(default,?,?,?,?,?,?,default)";
		Connection conn=this.openConnection();
		Object[] obs= {p.getMatId(),p.getMatName(),p.getUnitPrice(),
						p.getQuantity(),p.getPlanInfoDate(),p.getLoginName()};
		int count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
	}
	
	public int updataStatus(PlanInfo p) throws SQLException {
		String sql= "update planInfo set status=? where planInfoId=?";
		Connection conn=this.openConnection();
		Object[] obs= {p.isStatus(),p.getPlanInfoId()};
		int count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
	}

}
