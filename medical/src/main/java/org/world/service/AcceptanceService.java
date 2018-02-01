package org.world.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.world.dao.AcceptanceDao;
import org.world.model.Acceptance;

public class AcceptanceService {
	private AcceptanceDao accDao=new AcceptanceDao();
	private Logger logger=Logger.getLogger(AcceptanceService.class);
	
	/**
	 * ���һ���ɹ����������
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
}
