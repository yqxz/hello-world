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
	 * @param id   要查找的reqId
	 * @return 返回指定ID的一个对象
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
	 * 查询所有
	 * @return  返回一个请购主表的集合
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
	 * 删除指定ID的请购单
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
	 * 增加一个请购单
	 * @param req
	 * @return   添加成功与否
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
	 * 更新请购单状态
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
