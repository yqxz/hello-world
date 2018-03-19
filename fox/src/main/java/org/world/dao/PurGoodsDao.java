package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.PurGoods;

public class PurGoodsDao extends DBManager{
		
	/**
	 * 添加一条到货单主表信息
	 * @param acc  Acceptance的一个对象
	 * @return   受影响行数
	 * @throws SQLException
	 */
		public int insert(PurGoods pg) throws SQLException {
			String sql="insert into acceptance values(?,?,?,?,?,?,?)";
			Connection conn=this.openConnection();
			Object[] obs= {pg.getMatId(),pg.getMatName(),pg.getTotalNumber(),
					pg.getBatchNumber(),pg.getProDate(),pg.getValDate(),pg.getAccDate()};
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
