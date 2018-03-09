package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.world.dao.ReqpurchaseDao;
import org.world.model.Reqpurchase;

public class ReqpurchaseService {
	private ReqpurchaseDao reqDao=new ReqpurchaseDao();
	private Logger logger=Logger.getLogger(Reqpurchase.class);
	
	
	/**
	 * 
	 * @param id   Ҫ���ҵ�reqId
	 * @return ����ָ��ID��һ������
	 */
	public Reqpurchase get(String id) {
		Reqpurchase req=null;
		try {
			req=reqDao.query(id);
		} catch (SQLException e) {
			logger.debug(e);
		}
		return req;
	}
	/**
	 * ��ѯ����
	 * @return  ����һ���빺����ļ���
	 */
	public List<Reqpurchase> getAll(){
		List<Reqpurchase> reqList=null;
		try {
			reqList=reqDao.queryAll();
		} catch (SQLException e) {
			logger.debug(e);
		}
		return reqList;
	}
	
	/**
	 * ɾ��ָ��ID���빺��
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
	 * ����һ���빺��
	 * @param req
	 * @return   ��ӳɹ����
	 */
	public boolean add(Reqpurchase req) {
		int count=0;
		try {
			count=reqDao.insert(req);
		} catch (SQLException e) {
			logger.debug(e);
		}
		return count>0?true:false;
	}
	/**
	 * �����빺��״̬
	 * @param id
	 * @return 
	 */
	public boolean set(String id) {
		int count=0;
		try {
			count=reqDao.update(id);
		} catch (SQLException e) {
			logger.debug(e);
		}
		return count>0?true:false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
