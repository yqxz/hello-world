package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.datdbase.DBManager;
import org.world.model.Salereturndetial;

public class SalereturndetialDao extends DBManager{
	       public List<Salereturndetial> loadAll() throws SQLException{
	    	   List<Salereturndetial> list = new ArrayList<>();
	    	   Connection conn = this.openConnection();
	    	   String sql = "select * from salereturndetial";
	    	   ResultSet rs = this.query(conn, sql, null);
	    	   while(rs.next()){
	    		   Salereturndetial sd = new Salereturndetial();
	    		   sd.setStId(rs.getString("stId"));
	    		   sd.setSoId(rs.getString("soId"));
	    		   sd.setDrugId(rs.getString("durgId"));
	    		   sd.setDrugName(rs.getString("drugName"));
	    		   sd.setCusId(rs.getString("cusId"));
	    		   sd.setCudName(rs.getString("cudName"));
	    		   sd.setUnitPrice(rs.getDouble("uintPrice"));
	    		   sd.setQuantity(rs.getInt("quantity"));
	    		   sd.setAmount(rs.getDouble("amount"));
	    		   sd.setReason(rs.getString("reason"));
	    		   list.add(sd);
	    	   }
	    	   this.closeConnection(conn);
	    	   return list;
	       }

}
