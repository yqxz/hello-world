package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.ProstoreDao;
import org.world.model.Prostore;




public class ProstoreService {
	private ProstoreDao pdao=new ProstoreDao(); 
	
	
	
/**
 * ���ִ�����ѯ
 */
	public List<Prostore> extantNum() {
		List<Prostore> prostoreList=null;
		try {
			prostoreList=pdao.extantNum();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return prostoreList;
	}
	/**
	 * ���β�ѯ
	 */
	public List<Prostore> inProDate(){
		List<Prostore> prostoreList=null;
		try {
			prostoreList=pdao.inProDate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prostoreList;
	}
}
