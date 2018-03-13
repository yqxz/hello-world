package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Material;



public class MaterialDao extends DBManager{
	
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	@SuppressWarnings("all")
	public List<Material> selectName() throws SQLException{
		List<Material> list=new ArrayList<>();
		String  sql="select matId,matName from Material";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
			while(rs.next()){
				Material m=new Material();
				m.setMatId(rs.getInt("matId"));
				m.setMatName(rs.getString("matName"));;
				list.add(m);
			}
			this.closeConnection();
			return list;
	}
	
	
	
	
	
	
	
	
	
}
