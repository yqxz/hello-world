package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.SaleplandetialDao;
import org.world.model.Saleplandetial;

public class SaleplandetialService {
     SaleplandetialDao sd = new SaleplandetialDao();
     
     //查询所有的销售计划明细
     public List<Saleplandetial> loadAll(){
    	 List<Saleplandetial> list= null;
    	 try {
			list = sd.loadAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	 return list;
     }
     
     /**
      * 改变名校表的执行状态
      * @param spId
      * @return
      */
     public boolean changeRate(String spId) {
    	 int count=0;
    	 try {
			count=sd.changeRate(spId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	 return count>0?true:false;
     }
}
