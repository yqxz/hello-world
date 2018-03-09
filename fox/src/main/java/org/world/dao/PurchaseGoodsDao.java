package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.PurchaseGoods;
import org.world.model.PurchasedetialGoods;

public class PurchaseGoodsDao extends DBManager{
	//到货主表中添加数据
	public int addPurchaseGoods(PurchaseGoods pg) throws SQLException {
		int count=0;
		String sql="insert into acceptance values(?,?,?,?,?,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {pg.getAccId(),pg.getAccDate(),pg.getVariety(),pg.getTotalNumber1(),pg.getBatchNumber(),pg.getOriginNumber(),pg.getAskTime()};
		count=this.update(conn, sql, obs);
		return count;
	}
	//到货明细表中添加数据
		public int addpurchasedetialGoods(PurchasedetialGoods pdg) throws SQLException {
			String sql="insert into acceptdetial values(?,?,?,?,?,?,?,?)";
			Connection conn=this.openConnection();
			Object[] obs= {pdg.getAccId(),pdg.getPurId(),pdg.getMatId(),
					       pdg.getMatName(),pdg.getProDate(),pdg.getValDate(), pdg.getAccNumber(),
					       pdg.getSupName()};
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
			
			
			
		} 

}
