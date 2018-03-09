package org.world.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.world.database.DBManager;
import org.world.model.Saleoutstore;
import org.world.model.Sosdetial;

public class AddSaleoutstoreDao extends DBManager {

	public int addsaleoutstore(Saleoutstore sos) throws SQLException {
		String sql = "insert into Saleoutstore values(?,?,?,?,?,?,?,?)";
		Connection conn = this.openConnection();
		Object[] obj = { sos.getSosId(), sos.getSoId(), sos.getRepName(),sos.getVariety(),
				sos.getTotalNumber(),sos.getOutStoreDate(),sos.getUserId(), sos.getUserName() };
		int count = this.update(conn, sql, obj);
		this.closeConnection();
		return count;
	}

	public int addsosdetial(Sosdetial st) throws SQLException {
		String sql = "insert into sosdetial values(?,?,?,?,?,?)";
		Connection conn = this.openConnection();
		Object[] obj = { st.getSosId(),st.getDrugId(),st.getDrugName(),st.getMatSpec(),
				st.getMetering(),st.getAmount() };
		int count = this.update(conn, sql, obj);
		this.closeConnection();
		return count;
	}
}
