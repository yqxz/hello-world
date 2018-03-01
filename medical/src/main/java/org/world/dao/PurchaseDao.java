package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.entity.Purchase;
import org.world.entity.Purchasedetial;

public class PurchaseDao extends DBManager{
	public int addPurchase(Purchase p) throws SQLException {
		String sql="insert into purchase values(?,?,?,?,?,?,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {p.getPurId(),p.getUserId(),p.getUserName(),p.getSupName(),p.getPurTime(),p.getVariety(),p.getTotalNumber(),p.getTotalNumber()};
		int count=this.update(conn, sql, obs);
		this.closeConnection(conn);
		return count;
		
	}
	public int addPurchasedetial(Purchasedetial pd) throws SQLException {
		int count=0;
		String sql="insert into purchasedetial values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {pd.getPurId(),pd.getSupId(),pd.getMatId(),pd.getMatName(),
								pd.getMatCategory(),pd.getMatSpec(),pd.getMetering(),
				pd.getUnitPrice(),pd.getQuantity(),pd.getExpectDate(),pd.getAmount()};
			count=this.update(conn, sql, obs);
			this.closeConnection(conn);
			return count;
	}


}
