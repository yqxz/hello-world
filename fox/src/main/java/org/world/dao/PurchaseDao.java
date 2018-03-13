package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Purchase;
import org.world.model.Purchasedetial;

public class PurchaseDao extends DBManager{
	public int addPurchase(Purchase p) throws SQLException {
		String sql="insert into purchase values(default,?,?,?,?,?,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {p.getUserId(),p.getUserName(),p.getSupName(),p.getPurTime(),p.getVariety(),p.getTotalNumber(),p.getTotalNumber()};
		int count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
		
	}
	public int addPurchasedetial(Purchasedetial pd) throws SQLException {
		int count=0;
		String sql="insert into purchasedetial values(?,?,?,?,?,?,?,default,default,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {pd.getPurId(),pd.getSupId(),pd.getMatId(),pd.getMatName(),
					pd.getMetering(),pd.getUnitPrice(),pd.getQuantity(),
						pd.getExpectDate(),pd.getAmount()};
			count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
	}

	/**
	 * 
	 * @return  获得最大的单号Id
	 * @throws SQLException
	 */
	@SuppressWarnings("all")
	public int getMaxId() throws SQLException {
		String sql="select MAX(purId) from purchase";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
		int count=0;
		if(rs.next()) {
			count=rs.getInt(1);
		}
		this.closeConnection();
		System.out.println("count-->"+count);
		return count;
	}
}
