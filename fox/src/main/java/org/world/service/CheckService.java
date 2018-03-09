package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.CheckDao;
import org.world.model.InfoCheck;


public class CheckService {
	CheckDao cd=new CheckDao();
	public List<InfoCheck> loadInfo(){
		List<InfoCheck> list=null;
		try {
			list = cd.loadInfo();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	

}
