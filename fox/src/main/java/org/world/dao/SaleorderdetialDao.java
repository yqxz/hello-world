package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Saleorderdetial;

public class SaleorderdetialDao extends DBManager{
   public List<Saleorderdetial> loadAll() throws SQLException{
	   List<Saleorderdetial> list = new ArrayList<>();
	   String sql = "select * from saleorderdetial";
	   Connection conn = this.openConnection();
	   ResultSet rs = this.query(conn, sql, null);
	   while(rs.next()) {
		   Saleorderdetial sd = new Saleorderdetial();
		   sd.setSoId(rs.getString("soId"));
		   sd.setDrugId(rs.getString("drugId"));
		   sd.setDrugName(rs.getString("drugName"));
		   sd.setAmount(rs.getInt("amount"));
		   sd.setUnitPrice(rs.getDouble("unitPrice"));
		   list.add(sd);
	   }
	   this.closeConnection();
	   return list;
   }
}
