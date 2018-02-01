package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.entity.Purchase;

public class PurchaseDao extends DBManager{
	public int addPurchase(Purchase p) throws SQLException {
		String sql="insert into purchase values(?,?,?,?,?,?,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {p.getPurId(),p.getUserId(),p.getUserName(),p.getSupName(),p.getPurTime(),p.getVariety(),p.getTotalNumber(),p.getTotalNumber()};
		int count=this.update(conn, sql, obs);
		this.closeConnection(conn);
		return count;
		
	}

}
