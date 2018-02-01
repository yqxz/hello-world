package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.world.dao.ReqpurdetialDao;
import org.world.model.Reqpurdetial;

public class ReqpurdetialService {
		private ReqpurdetialDao reqDao=new ReqpurdetialDao();
		private Logger logger=Logger.getLogger(Reqpurdetial.class);
		/**
		 * ͨ��reqId ��ѯ��Ӧ��ϸ�������
		 * @param id
		 * @return
		 */
		public List<Reqpurdetial> getById(String id){
			List<Reqpurdetial> reqList=null;
			try {
				reqList=reqDao.queryById(id);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return reqList;
		}
		/**
		 * ɾ��ָ��reqId����������
		 * @param id
		 * @return
		 */
		public boolean remove(String id) {
			int count=0;
			try {
				count=reqDao.delete(id);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		/**
		 * �������
		 * @param req
		 * @return
		 */
		public boolean add(Reqpurdetial req) {
			int count=0;
			try {
				count=reqDao.insert(req);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
