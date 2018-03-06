package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.datdbase.DBManager;
import org.world.model.Saleorder;
import org.world.model.Saleorderdetial;



public class AddSaleOrderDao extends DBManager {
	//销售订单添加主表
	public int addSaleOrder(Saleorder saleOrder) throws SQLException {
		String sql = "insert into saleorder values(?,?,?,?,?,?,?,?,?,default)";
		Connection conn  = this.openConnection();
		Object[] obj = {saleOrder.getSoId(),saleOrder.getTotalNumber(),saleOrder.getTotalMoney(),
				saleOrder.getDeposit(),saleOrder.getCusId(),saleOrder.getCudName(),
				saleOrder.getCreatDate(),saleOrder.getUserId(),saleOrder.getUserName()};
		int count  = this.update(conn, sql, obj);
		return count;
	}
	//销售订单添加明细表
	public int addSaleOrderdetial(Saleorderdetial saleOrderdetial) throws SQLException {
		String sql = "insert into Saleorderdetial values(?,?,?,?,?,?,?)";
		Connection conn  = this.openConnection();
		Object[] obj = {saleOrderdetial.getSoId(),saleOrderdetial.getDrugId(),saleOrderdetial.getDrugName()
				,saleOrderdetial.getMatSpec(),saleOrderdetial.getMetering(),saleOrderdetial.getAmount(),saleOrderdetial.getUnitPrice()};
		int count  = this.update(conn, sql, obj);
		return count;
	}

}
