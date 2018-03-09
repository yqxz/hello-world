package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Sosdetial;


public class SosdetialDao extends DBManager{
   public List<Sosdetial> loadAll() throws SQLException{
	   List<Sosdetial> list = new ArrayList<>();
	   Connection conn = this.openConnection();
	   String sql = "select * from Sosdetial";
	   ResultSet rs = this.query(conn, sql, null);
	   while(rs.next()){
		   Sosdetial so = new Sosdetial();
		   so.setSosId(rs.getString("sosId"));
		   so.setDrugId(rs.getString("drugId"));
		   so.setDrugName(rs.getString("drugName"));
		   so.setAmount(rs.getInt("amount"));
		   list.add(so);
	   }
	   this.closeConnection();
	   return list;
	   
   }
}
