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
			e.printStackTrace();
		}
		return piList;
	}
	
	
	/**
	 * 
	 * @param list 
	 * @return  添加一个采购任务
	 */
	public boolean addPlanInfo(List<PlanInfo> list) {
		int count=0;
		if(list!=null&&list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				try {
				count+=pf.insert(list.get(i));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return count>0?true:false;
	}
	
	
	
	
	
	
	
	
	
	
	

}
