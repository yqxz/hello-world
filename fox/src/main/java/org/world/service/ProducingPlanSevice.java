package org.world.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.world.dao.ProducingPlanDao;
import org.world.model.ProducingPlan;


public class ProducingPlanSevice{
	public int PlanUploadSevice(List obs) {
		int count=0;
		ProducingPlanDao produceplan=new ProducingPlanDao();
		Connection conn;
		try {
			conn = produceplan.openConnection();
			for(int i=0;i< obs.size();i++) {
				ProducingPlan planEntity;
				planEntity=(ProducingPlan) obs.get(i);
				//System.out.println(values[0].toString()+values[1].toString()+values[2].toString()+values[3].toString());
				produceplan.closeConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	
}
