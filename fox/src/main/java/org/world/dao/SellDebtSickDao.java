package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.SellDebtSick;

public class SellDebtSickDao extends DBManager {
	public List<SellDebtSick> salesPlan(Object...obs) {
		String sql="select * from salesplan where saleStatus=1";
		ResultSet rs;
		List rls=new ArrayList();
		try {
			Connection conn=this.openConnection();
			rs=this.query(conn, sql, obs);
			while(rs.next()) {
				SellDebtSick e=new SellDebtSick();
				e.setProName(rs.getString("proName"));
				e.setCount(rs.getInt("proCount"));
				e.setStatus(rs.getInt("saleStatus"));
				rls.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rls;
	}
}
