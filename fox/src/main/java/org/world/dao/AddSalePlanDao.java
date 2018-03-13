package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.SalePlan;
import org.world.model.Saleplandetial;



public class AddSalePlanDao extends DBManager {
    public int addSalePlan(SalePlan sp) throws SQLException {
    	String sql ="insert into saleplan values(default,?,?,?,?,?,?,?)";
    	Connection conn = this.openConnection();
    	Object[] obj= {sp.getVariety(),sp.getTotalNumber(),sp.getUserId(),sp.getLoginName(),
    			sp.getBeginDate(),sp.getEndDate(),sp.getTotalMoney()};
    	int count = this.update(conn, sql, obj);
    	this.closeConnection();
    	return count;
    }
    
    public int addSalePlandetial(Saleplandetial spd) throws SQLException {
    	String sql = "insert into saleplandetial values(?,?,?,?,?,default,default)";
    	Connection conn = this.openConnection();
    	Object[] obj = {spd.getSpId(),spd.getDrugId(),spd.getDrugName(),
    			spd.getUnitPrice(),spd.getAmount()};   
    	int count  = this.update(conn, sql, obj);
    	this.closeConnection();
    	return count;
    }
    
    @SuppressWarnings("all")
	public int getMaxId() throws SQLException {
		String sql="select MAX(spId) from saleplan";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
		int count=0;
		if(rs.next()) {
			count=rs.getInt(1);
		}
		this.closeConnection();
		return count;
	}
}
