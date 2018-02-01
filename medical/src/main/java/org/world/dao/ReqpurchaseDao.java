package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Reqpurchase;

public class ReqpurchaseDao extends DBManager{
	
	/**
	 * 
	 * @param id
	 * @return ����ָ��ID�� �빺������
	 * @throws SQLException
	 */
	public Reqpurchase query(String id) throws SQLException {
		Reqpurchase req=null;
		String sql="select * from Reqpurchase where reqId=?";
		Connection conn=this.openConnection();
		Object[] obs= {id};
		ResultSet rs=this.query(conn, sql, obs);
		if(rs.next()) {
			req=new Reqpurchase();
			req.setUserId(rs.getString("userId"));
			req.setVariety(rs.getInt("variety"));
			req.setTotalNumber(rs.getInt("totalNumber"));
			req.setReqDate(rs.getString("reqDate"));
			req.setReqType(rs.getString("reqType"));
			req.setUserId(rs.getString("userId"));
			req.setUserName(rs.getString("userName"));
			req.setReqState(rs.getBoolean("reqState"));
		}
		this.closeConnection();
		return req;
	}
	/**
	 * ��ѯ����
	 * @return  һ��Reqpurchase��List����
	 * @throws SQLException
	 */
	public List<Reqpurchase> queryAll() throws SQLException {
		List<Reqpurchase> reqList=new ArrayList<>();
		String sql="select * from Reqpurchase";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
		while(rs.next()) {
			Reqpurchase req=new Reqpurchase();
			req.setUserId(rs.getString("userId"));
			req.setVariety(rs.getInt("variety"));
			req.setTotalNumber(rs.getInt("totalNumber"));
			req.setReqDate(rs.getString("reqDate"));
			req.setReqType(rs.getString("reqType"));
			req.setUserId(rs.getString("userId"));
			req.setUserName(rs.getString("userName"));
			req.setReqState(rs.getBoolean("reqState"));
			reqList.add(req);
		}
		this.closeConnection();
		return reqList;
	}
	/**
	 * ɾ��ָ��ID���빺��
	 * @param id   Ҫɾ����reqID
	 * @return    �ɹ�����1 ʧ��0
	 * @throws SQLException
	 */
	public int delete(String id) throws SQLException {
		String sql="delete from Reqpurchase where reqId=?";
		Connection conn=this.openConnection();
		Object[] obs= {id};
		int count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
	}
	/**
	 * ���һ���빺��
	 * @param req
	 * @return  ������Ӱ������
	 * @throws SQLException
	 */
	public int insert(Reqpurchase req) throws SQLException {
		String sql="insert into Reqpurchase values(?,?,?,?,?,?,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {req.getReqId(),req.getVariety(),req.getTotalNumber(),req.getReqDate(),
				req.getReqType(),req.getUserId(),req.getUserName(),req.getReqState()};
		int count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
	}
	/**
	 * ��ָ��reqId���빺��״̬������Ϊtrue
	 * @param id
	 * @return 1�ɹ�  0ʧ��
	 * @throws SQLException
	 */
	public int update(String id) throws SQLException {
		String sql="update Reqpurchase set reqState=true where reqId=?";
		Connection conn=this.openConnection();
		Object[] obs= {id};
		int count=this.update(conn, sql, obs);
		return count;
	}
	
}
