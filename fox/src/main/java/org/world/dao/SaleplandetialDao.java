package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Saleplandetial;


public class SaleplandetialDao extends DBManager {
    public List<Saleplandetial> loadAll() throws SQLException {
    	List<Saleplandetial> list= new ArrayList<>();
        String sql="SELECT drugid,drugname,soamount ,saamount,rate\r\n" + 
        		"FROM (SELECT a.drugid,a.drugname,a.soamount ,b.saamount,\r\n" + 
        		"CONCAT ( LEFT ((b.saamount) / (a.soamount) *100,5),'%') AS rate\r\n" + 
        		"FROM (SELECT drugid,drugname, SUM(amount) AS soamount FROM sosdetial GROUP BY(drugId))a\r\n" + 
        		"INNER JOIN (SELECT drugid,drugname, SUM(amount) AS saamount FROM Saleplandetial GROUP BY(drugId)) b \r\n" + 
        		"ON a.drugid = b.drugid) a;";
    	Connection conn = this.openConnection();
    	ResultSet rs = this.query(conn, sql, null);
    	while(rs.next()) {
    		Saleplandetial sl = new Saleplandetial();
    		sl.setDrugId(rs.getString("drugId"));
    		sl.setDrugName(rs.getString("drugName"));
    		sl.setSoamount(rs.getInt("soamount"));
    		sl.setSaamount(rs.getInt("saamount"));
    		sl.setRate(rs.getString("rate"));
    		list.add(sl);
    	}
    	this.closeConnection();
    	return list;
    }
}
