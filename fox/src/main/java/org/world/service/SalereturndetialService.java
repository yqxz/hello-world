package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.SalereturndetialDao;
import org.world.model.Salereturndetial;

public class SalereturndetialService {
	SalereturndetialDao sd = new SalereturndetialDao();
	public List<Salereturndetial> loadAll(){
		List<Salereturndetial> list = null;
		try {
			list = sd.loadAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
