package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.entity.Purchasedetial;

public class PurchasedetialDao extends DBManager{
	public int addPurchasedetial(Purchasedetial pd) throws SQLException {
		int count=0;
		String sql="insert into purchasedetial values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {pd.getPurId(),pd.getSupId(),pd.getMatId(),pd.getMatName(),
								pd.getMatCategory(),pd.getMatSpec(),pd.getMetering(),
				pd.getUnitPrice(),pd.getQuantity(),pd.getExpectDate(),pd.getAmount()};
			count=this.update(conn, sql, obs);
			System.out.println(count);
			this.closeConnection(conn);
			return count;
	}

}
