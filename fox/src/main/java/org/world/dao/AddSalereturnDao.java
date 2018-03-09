package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Salereturn;
import org.world.model.Salereturndetial;

public class AddSalereturnDao extends DBManager {
	public int addSalereturnDao(Salereturn sr) throws SQLException {
		String sql = "insert into Salereturn values(?,?,?,?,?,?,?)";
		Connection conn = this.openConnection();
		Object[] obj = { sr.getStId(),sr.getVariety(),sr.getTotalNumber(),sr.getStDate(),
				sr.getTotalMoney(),sr.getUserId(),sr.getUserName()};
		int count = this.update(conn, sql, obj);
		this.closeConnection();
		return count;
	}

	public int addSalereturndetial(Salereturndetial std) throws SQLException {
		String sql = "insert into salereturndetial values(?,?,?,?,?,?,?,?,?,?,?,default)";
		Connection conn = this.openConnection();
		Object[] obj = {std.getStId(),std.getSoId(),std.getDrugId(),std.getDrugName(),std.getMatSpec(),std.getMetering(),std.getCusId(),
				           std.getCusName(),std.getUnitPrice(),std.getQuantity(),std.getAmount()};
		int count = this.update(conn, sql, obj);
		this.closeConnection();
		return count;
	}

}
