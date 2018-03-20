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
		   sd.setDrugId(rs.getInt("drugId"));
		   sd.setDrugName(rs.getString("drugName"));
		   sd.setMetering(rs.getString("metering"));
		   sd.setNumber(rs.getInt("number"));
		   sd.setOutNumber(rs.getInt("outNumber"));
		   sd.setUnitPrice(rs.getDouble("unitPrice"));
		   list.add(sd);
	   }
	   this.closeConnection();
	   return list;
   }
   
   public List<Saleorderdetial> loadById(String soId) throws SQLException{
	   List<Saleorderdetial> list = new ArrayList<>();
	   String sql = "select * from saleorderdetial where soId=?";
	   Connection conn = this.openConnection();
	   Object[] obs= {soId};
	   ResultSet rs = this.query(conn, sql, obs);
	   while(rs.next()) {
		   Saleorderdetial sd = new Saleorderdetial();
		   sd.setSoId(rs.getString("soId"));
		   sd.setDrugId(rs.getInt("drugId"));
		   sd.setDrugName(rs.getString("drugName"));
		   sd.setMetering(rs.getString("metering"));
		   sd.setNumber(rs.getInt("number"));
		   sd.setOutNumber(rs.getInt("outNumber"));
		   sd.setUnitPrice(rs.getDouble("unitPrice"));
		   list.add(sd);
	   }
	   this.closeConnection();
	   return list;
   }
}
