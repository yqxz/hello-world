package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.PlanInfoDao;
import org.world.model.PlanInfo;

public class PlanInfoService {
	PlanInfoDao pf=new PlanInfoDao();
	public List<PlanInfo> loadPlanInfo(){
		List<PlanInfo> piList=null;
		try {
			piList = pf.loadPlanInfo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return piList;
		
	}

}
