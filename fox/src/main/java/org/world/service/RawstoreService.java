package org.world.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.world.dao.RawstoreDao;
import org.world.model.Rawstore;

public class RawstoreService {
		private RawstoreDao rawDao=new RawstoreDao();
		private Logger logger=Logger.getLogger(RawstoreService.class);
		
		/**
		 * 添加一条原材料信息
		 * @param raw
		 * @return
		 */
		public boolean add(Rawstore raw) {
			int count=0;
			try {
				count=rawDao.insert(raw);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**
		 * 检测结果出来后，在数据库更新相应的数据
		 * @param raw
		 * @return
		 */
		public boolean change(Rawstore raw) {
			int count=0;
			try {
				count=rawDao.update(raw);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**
		 * 查询所有信息按照指定的字段分类展示
		 * @param ob
		 * @return
		 */
		public List<Rawstore> get(Object ob){
			List<Rawstore> rawList=new ArrayList<>();
			try {
				rawList=rawDao.query(ob);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return rawList;
		}
		
}
