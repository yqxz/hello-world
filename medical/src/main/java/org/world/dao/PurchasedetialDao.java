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
		 * ����purId��ѯ��Ӧ����
		 * @param id
		 * @return  ���ض�ӦpurId��һ�����󼯺�
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
					pur.setSupId(rs.getString("supId"));
					pur.setMatId(rs.getString("matId"));
					pur.setMatName(rs.getString("matName"));
					pur.setMatCategory(rs.getString("matCategory"));
					pur.setMatSpec(rs.getString("matSpec"));
					pur.setMetering(rs.getString("metering"));
					pur.setUnitPrice(rs.getDouble("unitPrice"));
					pur.setQuantity(rs.getInt("quantity"));
					pur.setExpectDate(rs.getString("expectDate"));
					pur.setAmount(rs.getDouble("amount"));
					purList.add(pur);
			}
			return purList;
		}
		/**
		 * �������
		 * @param pur  Purchasedetial���һ������
		 * @return 	   
		 * @throws SQLException
		 */
		public int insert(Purchasedetial pur) throws SQLException {
			String sql="insert into Purchasedetial values(?,?,?,?,?,?,?,?,?,?,?)";
			Object[] obs= {pur.getPurId(),pur.getSupId(),pur.getMatId(),pur.getMatName(),pur.getMatCategory(),
								pur.getMatSpec(),pur.getMetering(),pur.getUnitPrice(),pur.getQuantity(),
									pur.getExpectDate(),pur.getAmount()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			return count;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
