package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Purchasedetial;

public class PurchasedetialDao extends DBManager{
		/**
		 * 查询订单执行进度
		 * @param id
		 * @return  返回对应purId的一个对象集合
		 * @throws SQLException
		 */
		public List<Purchasedetial> queryById(String id) throws SQLException{
			List<Purchasedetial> purList=new ArrayList<>();
			String sql="select * from Purchasedetial where purId=?";
			Object[] obs= {id};
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, obs);
			while(rs.next()) {
				Purchasedetial pur=new Purchasedetial();
					pur.setPurId(rs.getString("purId"));
					pur.setSupName(rs.getString("supName"));
					pur.setMatName(rs.getString("matName"));
					pur.setMetering(rs.getString("metering"));
					pur.setQuantity(rs.getInt("quantity"));
					pur.setArriveNumber(rs.getInt("arriveNumber"));
					pur.setInStoreNumber(rs.getInt("inStoreNumber"));
					pur.setExpectDate(rs.getString("expectDate"));
					purList.add(pur);
			}
			this.closeConnection();
			return purList;
		}
		/**
		 * 添加数据
		 * @param pur  Purchasedetial类的一个对象
		 * @return 	   
		 * @throws SQLException
		 */
		public int insert(Purchasedetial pur) throws SQLException {
			String sql="insert into Purchasedetial values(?,?,?,?,?,?,?,?,?,default,default,?,?)";
			Object[] obs= {pur.getPurId(),pur.getSupName(),pur.getMatId(),pur.getMatName(),pur.getMatCategory(),
								pur.getMatSpec(),pur.getMetering(),pur.getUnitPrice(),pur.getQuantity(),
									pur.getExpectDate(),pur.getAmount()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
