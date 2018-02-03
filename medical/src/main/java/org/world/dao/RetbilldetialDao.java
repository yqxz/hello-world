package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Retbilldetial;

public class RetbilldetialDao extends DBManager{
//			private String retId;
//			private String purId;
//			private String batchNumber;
//			private String matId;
//			private String matName;
//			private String supId;
//			private double unitPrice;
//			private int quantity;
//			private double amount;
//			private String reason;
	
		/**
		 * 添加一条退货明细表数据
		 * @param ret
		 * @return
		 * @throws SQLException
		 */
		public int add(Retbilldetial ret) throws SQLException {
			String sql="insert into Retbilldetial values(?,?,?,?,?,?,?,?,?,?)";
			Object[] obs= {ret.getRetId(),ret.getPurId(),ret.getBatchNumber(),ret.getMatId(),
							ret.getMatName(),ret.getSupId(),ret.getUnitPrice(),ret.getQuantity(),
								ret.getAmount(),ret.getReason()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
}
