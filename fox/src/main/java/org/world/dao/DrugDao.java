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
			d.setDrugSpec(rs.getString("drugSpec"));
			d.setApprovalNum(rs.getString("approvalNum"));
			list.add(d);
		}
		this.closeConnection();
		return list;
	}
}
