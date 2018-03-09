package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.PurCheckDao;
import org.world.model.PurCheck;

public class PurCheckService {
	PurCheckDao pcd=new PurCheckDao();
	public List<PurCheck> loadPurCheck(){
		List<PurCheck> pcList=null;
		try {
			pcList = pcd.loadPurCheck();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pcList;
		
		
	}

}
