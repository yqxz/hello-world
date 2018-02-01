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
	 * @return 返回指定ID的 请购单对象
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
	 * 查询所有
	 * @return  一个Reqpurchase的List集合
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
	 * 删除指定ID的请购单
	 * @param id   要删除的reqID
	 * @return    成功返回1 失败0
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
	 * 添加一个请购单
	 * @param req
	 * @return  返回受影响行数
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
	 * 将指定reqId的请购单状态，设置为true
	 * @param id
	 * @return 1成功  0失败
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
