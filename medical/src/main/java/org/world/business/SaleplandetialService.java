package org.world.business;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.SaleplandetialDao;
import org.world.model.Saleplandetial;

public class SaleplandetialService {
     SaleplandetialDao sd = new SaleplandetialDao();
     public List<Saleplandetial> loadAll(){
    	 List<Saleplandetial> listsl= null;
    	 try {
			listsl = sd.loadAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return listsl;
     }
}
