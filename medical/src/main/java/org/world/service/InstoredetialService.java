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
	 * �����ϸ����Ϣ
	 * @param inList   һ��Instoredetial�Ķ��󼯺�
	 * @return  ���ز���ɹ�������
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
