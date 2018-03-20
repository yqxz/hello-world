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
        String sql="select * from Saleplandetial";
    	Connection conn = this.openConnection();
    	ResultSet rs = this.query(conn, sql, null);
    	while(rs.next()) {
    		Saleplandetial sl = new Saleplandetial();
    		sl.setSpId(rs.getString("spId"));
    		sl.setDrugId(rs.getString("drugId"));
    		sl.setDrugName(rs.getString("drugName"));
    		sl.setUnitPrice(rs.getDouble("unitPrice"));
    		sl.setAmount(rs.getInt("amount"));
    		sl.setOutAmount(rs.getInt("outAmount"));
    		sl.setRate(rs.getString("rate"));
    		list.add(sl);
    	}
    	this.closeConnection();
    	return list;
    }
    
    /**
     * 改变明细表执行状态
     * @param spId
     * @return
     * @throws SQLException
     */
    public int changeRate(String spId) throws SQLException {
    	String sql="update Saleplandetial set rate='已执行' where spId=?";
    	Connection conn=this.openConnection();
    	Object[] obs= {spId};
    	int count=this.update(conn, sql, obs);
    	this.closeConnection();
    	return count;
    }
}
