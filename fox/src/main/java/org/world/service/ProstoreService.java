package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.ProstoreDao;
import org.world.model.Acceptdetial;
import org.world.model.Prostore;




public class ProstoreService {
	private ProstoreDao pdao=new ProstoreDao(); 
	
	/**
	 * 模糊查询
	 * @return
	 */
	public List<Prostore> blurAll(String name){
		List<Prostore> prostorelist=null;
		try {
			prostorelist=pdao.blur(name);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return prostorelist;
	}
	

	
/**
 * 按现存量查询
 */
	public List<Prostore> extantNum(int page,int rows) {
		List<Prostore> prostoreList=null;
		try {
			prostoreList=pdao.extantNum(page-1,rows);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return prostoreList;
	}
	/**
	 * 批次查询
	 */
	public List<Prostore> inProDate(int page,int rows){
		List<Prostore> prostoreList=null;
		try {
			prostoreList=pdao.inProDate(page-1,rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prostoreList;
	}
	/**
	 * 库存台账查询
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<Prostore> standingBook(int page,int rows){
		List<Prostore> prostoreList=null;
		try {
			prostoreList=pdao.standingBook(page-1, rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prostoreList;
	}
	/**
	 * 有效期查询
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<Prostore> valDate(int page,int rows){
		List<Prostore> prostoreList=null;
		try {
			prostoreList=pdao.valDate(page-1, rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prostoreList;
	}
	/**
	 * 数据总数
	 * @return
	 */
	public int getCount() {
		int count=0;
		try {
			count=pdao.getCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
}
