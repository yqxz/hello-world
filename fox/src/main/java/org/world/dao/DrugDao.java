package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Drug;

public class DrugDao extends DBManager{
	
	@SuppressWarnings("all")
	public List<Drug> selectAll() throws SQLException{
		List<Drug> list=new ArrayList<>();
		String sql="select * from drug";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
		while(rs.next()) {
			Drug d=new Drug();
			d.setDrugId(rs.getInt("drugId"));
			d.setDrugCategory(rs.getString("drugCategory"));
			d.setDrugName(rs.getString("drugName"));
			d.setMetering(rs.getString("metering"));
			d.setSpec(rs.getString("spec"));
			d.setApprovalNum(rs.getString("approvalNum"));
			d.setDrugCategory(rs.getString("drugCategory"));
			list.add(d);
		}
		this.closeConnection();
		return list;
	}
	
	/**
	 * 根据Id查询信息
	 * @param drugId
	 * @return
	 * @throws SQLException
	 */
	public Drug selectSpec(int drugId) throws SQLException{
		String sql="select * from drug where drugId=?";
		Connection conn=this.openConnection();
		Object[] obs= {drugId};
		ResultSet rs=this.query(conn, sql, obs);
		Drug d=null;
		if(rs.next()) {
			 d=new Drug();
			d.setDrugId(rs.getInt("drugId"));
			d.setDrugCategory(rs.getString("drugCategory"));
			d.setDrugName(rs.getString("drugName"));
			d.setMetering(rs.getString("metering"));
			d.setSpec(rs.getString("spec"));
			d.setApprovalNum(rs.getString("approvalNum"));
			d.setDrugCategory(rs.getString("drugCategory"));
		}
		this.closeConnection();
		return d;
	}
}
