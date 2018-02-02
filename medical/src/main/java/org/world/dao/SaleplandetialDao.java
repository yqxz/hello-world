package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.datdbase.DBManager;
import org.world.model.Saleplandetial;


public class SaleplandetialDao extends DBManager {
    public List<Saleplandetial> loadAll() throws SQLException {
    	List<Saleplandetial> list= new ArrayList<>();
    	String sql="select * from Saleplandetial";
    	Connection conn = this.openConnection();
    	ResultSet rs = this.query(conn, sql, null);
    	while(rs.next()) {
    		Saleplandetial sl = new Saleplandetial();
    		sl.setSpId(rs.getString("spId"));
    		sl.setDrugId(rs.getString("durgId"));
    		sl.setDrugName(rs.getString("drugName"));
    		sl.setAmount(rs.getInt("amount"));
    		list.add(sl);
    	}
    	this.closeConnection(conn);
    	return list;
    }
}
