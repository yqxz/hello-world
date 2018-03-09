package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Instoredetial;

public class InstoredetialDao extends DBManager{
	/**
	 * 添加一条入库明细表数据
	 * @param in
	 * @return
	 * @throws SQLException
	 */
	public int insert(Instoredetial in) throws SQLException {
		String sql="insert into Instoredetial values(?,?,?,?,?,?,?,?)";
		Object[] obs= {in.getInStoreId(),in.getPurId(),in.getMatId(),in.getBatchNumber(),
						in.getMatName(),in.getOriginNumber(),in.getQuantity(),in.getAmount()};
		Connection conn=this.openConnection();
		int count=this.update(conn, sql, obs);
		return count;
	}
}
