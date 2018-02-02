package org.world.business;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.SaleorderdetialDao;
import org.world.model.Saleorderdetial;

public class SaleorderdetialService {
	SaleorderdetialDao sd = new SaleorderdetialDao();
  public List<Saleorderdetial> loadAll(){
	  List<Saleorderdetial> list = null;
		  try {
			list=sd.loadAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  return list;
   }
}
