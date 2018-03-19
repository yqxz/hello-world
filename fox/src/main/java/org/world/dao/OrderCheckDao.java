package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.Theories;
import org.world.database.DBManager;
import org.world.model.OrderCheck;
import org.world.model.Purchase;
import org.world.model.Purchasedetial;

public class OrderCheckDao extends DBManager {
	public List<OrderCheck> loadPurchase() throws SQLException{
		List<OrderCheck> orderList=new ArrayList<>();
	String sql="select p.purId,p.supName,p.totalNumber,d.matName,d.metering,d.unitPrice,d.quantity,d.expectDate,d.amount from purchase p,purchasedetial d where p.purId=d.purId";
	Connection conn=this.openConnection();
	
	ResultSet rs=this.query(conn, sql, null);
	while(rs.next()) {
		OrderCheck oc=new OrderCheck();
		oc.setPurId(rs.getString("purId"));
		oc.setSupName(rs.getString("supName"));
		oc.setTotalNumber(rs.getInt("totalNumber"));
		oc.setMatName(rs.getString("matName"));
		oc.setMetering(rs.getString("metering"));
		oc.setUnitPrice(rs.getDouble("unitPrice"));
		oc.setQuantity(rs.getInt("quantity"));
		oc.setAmount(rs.getDouble("amount"));
		oc.setExpectDate(rs.getString("expectDate"));
		orderList.add(oc);
		
	}
	return orderList;
	}
			

}
