package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.world.dao.InstoredetialDao;
import org.world.database.DBManager;
import org.world.model.Instoredetial;

public class InstoredetialService extends DBManager{
		
	private InstoredetialDao inDao=new InstoredetialDao();
	private Logger logger=Logger.getLogger(InstoredetialService.class);
	
	/**
	 * 添加明细表信息
	 * @param inList   一个Instoredetial的对象集合
	 * @return  返回插入成功的条数
	 */
	public int add(List<Instoredetial> inList) {
		int count=0;
		for(int i=0;i<inList.size();i++) {
			try {
				inDao.insert(inList.get(i));
			} catch (SQLException e) {
				logger.debug(e);			
			}
			count++;
		}
		return count;
	}
}
