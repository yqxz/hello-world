package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.PlanInfo;

public class PlanInfoDao  extends DBManager{
	List<PlanInfo> piList=new ArrayList<>();
	public List<PlanInfo> loadPlanInfo() throws SQLException{
		String sql="select d.matName,d.matCategory,p.supName,d.matSpec,d.metering,d.unitPrice,d.amount,d.quantity from purchase p,purchasedetial d where p.purId=d.purId";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
		while(rs.next()) {
			PlanInfo pi=new PlanInfo();
			pi.setMatName(rs.getString("matName"));
			pi.setMatCategory(rs.getString("MatCategory"));
			pi.setSupName(rs.getString("supName"));
			pi.setMatSpec(rs.getString("matSpec"));
			pi.setMetering(rs.getString("metering"));
			pi.setUnitPrice(rs.getDouble("unitPrice"));
			pi.setAmount(rs.getDouble("amount"));
			pi.setQuantity(rs.getInt("quantity"));
			piList.add(pi);
			}
		return piList;
		
		
		
	}

}
