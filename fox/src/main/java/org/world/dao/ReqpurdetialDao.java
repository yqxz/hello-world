package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Reqpurdetial;

public class ReqpurdetialDao extends DBManager{
		/**
		 * 
		 * @param id
		 * @return  ָ��reqId��һ��Reqpurdetial���󼯺�
		 * @throws SQLException
		 */
		public List<Reqpurdetial> queryById(String id) throws SQLException {
			List<Reqpurdetial> reqList=new ArrayList<>();
			String sql="select * from Reqpurdetial where reqId=?";
			Object[] obs= {id};
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, obs);
			while(rs.next()) {
				Reqpurdetial req=new Reqpurdetial();
				req.setReqId(rs.getString("reqId"));
				req.setMatId(rs.getString("matId"));
				req.setMatName(rs.getString("matName"));
				req.setReqNumber(rs.getInt("reqNumber"));
				reqList.add(req);
			}
			this.closeConnection();
			return reqList;
		}
		/**
		 * ����reqIdɾ����Ӧ����
		 * @param id
		 * @return
		 * @throws SQLException
		 */
		public int delete(String id) throws SQLException {
			String sql="delete from Reqpurdetial where reqId=?";
			Object[] obs= {id};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		/**
		 * ���һ������
		 * @param req
		 * @return
		 * @throws SQLException
		 */
		public int insert(Reqpurdetial req) throws SQLException {
			String sql="insert into Reqpurdetial values(?,?,?,?)";
			Object[] obs= {req.getReqId(),req.getMatId(),req.getMatName(),req.getReqNumber()};
			Connection conn=this.openConnection();
			int count= this.update(conn, sql, obs);
				this.closeConnection();
				return count;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
