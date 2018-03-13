package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.MaterialDao;
import org.world.model.Material;

public class MaterialService {
	
	private MaterialDao md=new MaterialDao();
	
	/**
	 * 
	 * @return  查询药品名字和Id  matId matName
	 */
	public List<Material> getName(){
		List<Material> list=null;
		try {
			list= md.selectName();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
