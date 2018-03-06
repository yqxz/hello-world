package org.world.business;

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
}
