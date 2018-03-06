package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.datdbase.DBManager;
import org.world.model.SalePlan;
import org.world.model.Saleplandetial;



public class AddSalePlanDao extends DBManager {
    public int addSalePlan(SalePlan sp) throws SQLException {
    	String sql ="insert into saleplan values(?,?,?,?,?,?,?)";
    	Connection conn = this.openConnection();
    	Object[] obj= {sp.getSpId(),sp.getVariety(),sp.getTotalNumber(),sp.getUserId(),sp.getUserName(),
    			sp.getBeginDate(),sp.getEndDate()};
    	int count = this.update(conn, sql, obj);
    	this.closeConnection(conn);
    	return count;
    }
    
    public int addSalePlandetial(Saleplandetial spd) throws SQLException {
    	String sql = "insert into saleplandetial values(?,?,?,?,default,?,?)";
    	Connection conn = this.openConnection();
    	Object[] obj = {spd.getSpId(),spd.getDrugId(),spd.getDrugName(),spd.getAmount(),
    			spd.getMatSpec(),spd.getMetering()};   
    	int count  = this.update(conn, sql, obj);
    	this.closeConnection(conn);
    	return count;
    }
   
}
