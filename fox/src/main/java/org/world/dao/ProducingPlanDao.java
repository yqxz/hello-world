package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;

public class ProducingPlanDao extends DBManager {
	
	public int producingPlan(Object[]obs,Connection conn) throws SQLException{
		int count=0;
		System.out.println();
		String sql="insert into producingplan values(?,?,?,?)";
//		System.out.println(obs[0].toString()+obs[1].toString()+obs[2].toString()+obs[3].toString());查询数据是否传输进来
		count=this.update(conn, sql, obs);
		
		System.out.println();
		return count;
	}
}
