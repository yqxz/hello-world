package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.StoreGoods;
import org.world.model.StoredetialGoods;

public class StoreGoodsDao extends DBManager {
	//入库主表
	public int goodsLibrary(StoreGoods lg) throws SQLException {
		int count=0;
		String sql="insert into instore values(?,?,?,?,?,?,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {lg.getRepName(),lg.getRepName(),lg.getVariety(),lg.getInStoreDate(),
				       lg.getUserId(),lg.getUserName(),lg.getTotalNumber(),lg.getTotalMoney()};
		
		count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
	}
	//入库明细表
		public int storeGoods(StoredetialGoods sdg) throws SQLException {
			int count=0;
			String sql="insert into inStoredetial values(?,?,?,?,?,?,?,?)";
		    Connection conn=this.openConnection();
		    Object[] obs= {sdg.getInStoreId(),sdg.getPurId(),sdg.getMatId(),sdg.getBatchNumber(),
		    		       sdg.getMatName(),sdg.getOriginNumber(),sdg.getQuantity(),sdg.getAmount()};
		    count=this.update(conn, sql, obs);
		    this.closeConnection();
		    return count;
			}

}
