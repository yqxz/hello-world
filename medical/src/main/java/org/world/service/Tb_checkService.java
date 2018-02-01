package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.world.dao.Tb_checkDao;
import org.world.model.Tb_check;

public class Tb_checkService {
	private Tb_checkDao tbDao=new Tb_checkDao();
	private Logger logger=Logger.getLogger(Tb_checkService.class);
	
		/**
		 * 添加一个待检验表信息
		 * @param tb
		 * @return
		 */
		public boolean add(Tb_check tb) {
			int count=0;
			try {
				count=tbDao.insert(tb);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**
		 * 改变一个检验单的 waterIndex  impurity cheTime grade 属性值
		 * @param tb
		 * @return  
		 */
		public boolean change(Tb_check tb) {
			int count=0;
			try {
				count=tbDao.update(tb);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**
		 * 查询所有未检验的订单信息
		 * @return
		 */
		public List<Tb_check> getUnCheck(){
			List<Tb_check> tbList=null;
			try {
				tbList=tbDao.queryAll();
			} catch (SQLException e) {
				logger.debug(e);
			}
			return tbList;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
