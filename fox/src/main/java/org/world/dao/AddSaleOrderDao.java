package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Saleorder;
import org.world.model.Saleorderdetial;

public class AddSaleOrderDao extends DBManager {
	//销售订单添加主表
	public int addSaleOrder(Saleorder so) throws SQLException {
		String sql = "insert into saleorder values(?,?,?,?,?,?,?,default,default)";
		Connection conn  = this.openConnection();
		Object[] obj = {so.getSoId(),so.getCusId(),so.getCusName(),
				so.getUserId(),so.getLoginName(),so.getCreatDate(),so.getTotalNumber()};
		int count  = this.update(conn, sql, obj);
		return count;
	}
	//销售订单添加明细表
	public int addSaleOrderdetial(Saleorderdetial sod) throws SQLException {
		String sql = "insert into Saleorderdetial values(?,?,?,?,?,default,?)";
		Connection conn  = this.openConnection();
		Object[] obj = {sod.getSoId(),sod.getDrugId(),sod.getDrugName()
				,sod.getMetering(),sod.getNumber(),sod.getUnitPrice()};
		int count  = this.update(conn, sql, obj);
		return count;
	}
	
	 @SuppressWarnings("all")
	  public String getMaxId() throws SQLException {
	    String sql="select MAX(soId) from Saleorder";
	    Connection conn=this.openConnection();
	    ResultSet rs=this.query(conn, sql, null);
	    String count=null;
	    if(rs.next()) {
	      count=rs.getString(1);
	    }
	    this.closeConnection();
	    return count;
	  }

}
