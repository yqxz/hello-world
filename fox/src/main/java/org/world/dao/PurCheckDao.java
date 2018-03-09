package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.PurCheck;

public class PurCheckDao extends DBManager{
	public List<PurCheck> loadPurCheck() throws SQLException{
	List<PurCheck> pcList=new ArrayList<>();
	String sql="select a.batchNumber,d.purId,d.matId,d.matName from acceptance a,acceptdetial d where a.accId=d.accId";
	Connection conn=this.openConnection();
	ResultSet rs=this.query(conn, sql, null);
	while(rs.next()) {
	PurCheck pc=new PurCheck();	
	pc.setBatchNumber(rs.getString("batchNumber"));
	pc.setMatId(rs.getString("matId"));
	pc.setMatName(rs.getString("matName"));
	pc.setPurId(rs.getString("purId"));
	pcList.add(pc);
	}
	return pcList;
	
	
	}

}
