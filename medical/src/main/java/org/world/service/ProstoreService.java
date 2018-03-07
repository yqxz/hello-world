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
	 * ���β�ѯ
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
	 * ���̨�˲�ѯ
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
	 * ��Ч�ڲ�ѯ
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
	 * ��������
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
