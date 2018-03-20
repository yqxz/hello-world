package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.DrugDao;
import org.world.model.Drug;

public class DrugService {
	private DrugDao dd=new DrugDao();
	
	/**
	 * 
	 * @return  返回药品表所有信息
	 */
	public List<Drug> queryAll(){
		List<Drug> list=null;
		try {
			list=dd.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Drug queryById(int drugId) {
		Drug drug=null;
		try {
			drug=dd.selectSpec(drugId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return drug;
	}
}
