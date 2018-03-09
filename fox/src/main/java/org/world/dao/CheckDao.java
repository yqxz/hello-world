package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.InfoCheck;
import org.world.model.Purchase;
import org.world.model.PurchaseGoods;
import org.world.model.Purchasedetial;
import org.world.model.ReturnGoods;

public class CheckDao extends DBManager{
	//从表中查询数据
	public List<InfoCheck>loadInfo() throws SQLException {
	     List<InfoCheck> list=new ArrayList<>();
		 String sql="select u.supName,p.purId,p.matName,a.accNumber,r.quantity,p.expectDate from purchase u,purchasedetial p,acceptdetial a,retbilldetial r where u.purId=p.purId and p.purId=a.purId and a.purId=r.purId";
		  Connection conn=this.openConnection();
		 ResultSet rs = this.query(conn, sql, null);
		 while(rs.next()) {
			
			InfoCheck info=new InfoCheck();
			info.setPurId(rs.getString("purId"));
			info.setSupName(rs.getString("supName"));
			info.setMatName(rs.getString("matName"));
			info.setAccNumber(rs.getInt("accNumber"));
			info.setQuantity(rs.getInt("quantity"));
			
			info.setExpectDate(rs.getString("expectDate"));
			list.add(info);
			}
		 this.closeConnection();
		return list;
		}

}
