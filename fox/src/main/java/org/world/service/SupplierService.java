package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.SupplierDao;
import org.world.model.Prostore;
import org.world.model.Supplier;

public class SupplierService {

	private SupplierDao sd=new SupplierDao();
	
	public List<Supplier> queryAll(){
		List<Supplier> list=null;
		try {
			list=sd.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 数据总数
	 * @return
	 */
	public int getCount() {
		int count=0;
		try {
			count=sd.getCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	/**
	 * 按现存量查询
	 */
		public List<Supplier> getLimit(int page,int rows) {
			List<Supplier> list=null;
			try {
				list=sd.select(page-1,rows);
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return list;
		}
}
