package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.world.dao.PurGoodsDao;
import org.world.model.PurGoods;


public class PurGoodsService {
	private PurGoodsDao pgDao=new PurGoodsDao();
	private Logger logger=Logger.getLogger(PurGoodsService.class);
	
	/**
	 * 添加一条采购主表的数据
	 * @param acc
	 * @return
	 */
	public boolean add(List<PurGoods> purList) {
		int count=0;
		for(int i=0;i<purList.size();i++) {
			try {
				pgDao.insert(purList.get(i));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
		
		return count>0?true:false;
		}
}
