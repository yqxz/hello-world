package org.world.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.world.dao.AcceptanceDao;
import org.world.model.Acceptance;

public class AcceptanceService {
	private AcceptanceDao accDao=new AcceptanceDao();
	private Logger logger=Logger.getLogger(AcceptanceService.class);
	
	/**
	 * 添加一条采购主表的数据
	 * @param acc
	 * @return
	 */
	public boolean add(Acceptance acc) {
		int count=0;
		try {
			count=accDao.insert(acc);
		} catch (SQLException e) {
			logger.debug(e);
		}
		return count>0?true:false;
	}
	
	
	  /**
	   * 获得最大主键值
	   * @return
	   */
	  public String getMaxId() {
	    String count=null;
	    try {
	      count=accDao.getMaxId();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    return count;
	  }
}
