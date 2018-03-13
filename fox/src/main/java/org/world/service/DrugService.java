package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.DrugDao;
import org.world.model.Drug;

public class DrugService {
	private DrugDao dd=new DrugDao();
	
	/**
	 * 
	 * @return  ����ҩƷ��������Ϣ
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
}
