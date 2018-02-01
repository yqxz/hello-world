package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.world.dao.PurchasedetialDao;
import org.world.model.Purchasedetial;

public class PurchasedetialService {
		private PurchasedetialDao purDao=new PurchasedetialDao();
		private Logger logger=Logger.getLogger(PurchasedetialService.class);
		
		/**
		 * 根据purId查询对应集合
		 * @param id
		 * @return   指定purId的一个Purchasedetial类对象的集合
		 */
		public List<Purchasedetial> getById(String id){
			List<Purchasedetial> purList=null;
			try {
				purList=purDao.queryById(id);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return purList;
		}
		
		/**
		 * 添加信息
		 * @param purList  一个Purchasedetial类型的集合
		 * @return  返回添加成功的条数
		 */
		public int add(List<Purchasedetial> purList) {
			int count=0;
			for (int i = 0; i <purList.size(); i++) {
				try {
					purDao.insert(purList.get(i));
					count++;
				} catch (SQLException e) {
					logger.debug(e);
				}
			}
			return count;
		}
		
		
}
