package org.world.business;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.SosdetialDao;
import org.world.model.Sosdetial;

public class SosdetialService {
	SosdetialDao sd = new SosdetialDao();
	public List<Sosdetial> loadAll(){
	List<Sosdetial> list = null;
		try {
			list = sd.loadAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
