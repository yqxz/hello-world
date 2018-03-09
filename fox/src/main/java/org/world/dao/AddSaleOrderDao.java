package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.*;
import org.world.model.Saleorder;
import org.world.model.Saleorderdetial;



public class AddSaleOrderDao extends DBManager {
	//���۶����������
	public int addSaleOrder(Saleorder saleOrder) throws SQLException {
		String sql = "insert into saleorder values(?,?,?,?,?,?,?,?,?,default)";
		Connection conn  = this.openConnection();
		Object[] obj = {saleOrder.getSoId(),saleOrder.getTotalNumber(),saleOrder.getTotalMoney(),
				saleOrder.getDeposit(),saleOrder.getCusId(),saleOrder.getCudName(),
				saleOrder.getCreatDate(),saleOrder.getUserId(),saleOrder.getUserName()};
		int count  = this.update(conn, sql, obj);
		return count;
	}
	//���۶��������ϸ��
	public int addSaleOrderdetial(Saleorderdetial saleOrderdetial) throws SQLException {
		String sql = "insert into Saleorderdetial values(?,?,?,?,?,?,?)";
		Connection conn  = this.openConnection();
		Object[] obj = {saleOrderdetial.getSoId(),saleOrderdetial.getDrugId(),saleOrderdetial.getDrugName()
				,saleOrderdetial.getMatSpec(),saleOrderdetial.getMetering(),saleOrderdetial.getAmount(),saleOrderdetial.getUnitPrice()};
		int count  = this.update(conn, sql, obj);
		return count;
	}

}
