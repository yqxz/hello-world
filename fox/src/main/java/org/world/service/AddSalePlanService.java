package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.AddSalePlanDao;
import org.world.model.SalePlan;
import org.world.model.Saleplandetial;

public class AddSalePlanService {
   private AddSalePlanDao spd = new AddSalePlanDao();
   //销售计划添加主表
   public boolean addSalePlan(List<SalePlan> salePlanList) {
	   int count = 0;
	   for(int i= 0;i<salePlanList.size();i++) {
			try {
				spd.addSalePlan(salePlanList.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			   count++;
	   }
	   return count>0?true:false;
   }

   //销售计划添加明细表
   public boolean addSalePlanDetial(List<Saleplandetial> salePlandetialList) {
	   int count  = 0;
	   for(int i = 0;i<salePlandetialList.size();i++) {
			   try {
				spd.addSalePlandetial(salePlandetialList.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			   count++;
	   }
	   return count>0?true:false;
   }


	public String getMaxId() {
		String strMax=null;
		try {
			strMax=spd.getMaxId();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return strMax;
	}
}
