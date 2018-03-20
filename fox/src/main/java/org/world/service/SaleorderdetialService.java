package org.world.service;

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
  		
	  /**
	   * 按单号查询明细表数据
	   * @param soId
	   * @return
	   */
	  public List<Saleorderdetial> loadById(String soId){
		  List<Saleorderdetial> list = null;
			  try {
				list=sd.loadById(soId);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		  return list;
	   }
}
