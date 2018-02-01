package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Rawstore;

public class RawstoreDao extends DBManager{
		
		/**
		 * 添加一条材料信息表数据
		 * @param raw
		 * @return
		 * @throws SQLException
		 */
		public int insert(Rawstore raw) throws SQLException {
			String sql="insert into Rawstore values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			Object[] obs= {raw.getRawId(),raw.getMatId(),raw.getMatName(),raw.getMetering(),raw.getRawSpec(),
				raw.getBatchNumber(),raw.getRepId(),raw.getRepName(),raw.getProDate(),raw.getValDate(),
				raw.getExtantNum(),raw.getOriginNumber(),raw.getWaterIndex(),raw.getImpurity(),raw.getWaitCheck()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		/**
		 * 检测结果出来后更新对应的库存信息
		 * @param raw
		 * @return
		 * @throws SQLException
		 */
		public int update(Rawstore raw) throws SQLException {
			String sql="update Rawstore set extantNum=?,waterIndex=?,impurity=?,waitCheck=0 where rawId=? ";
			Object[] obs= {raw.getExtantNum(),raw.getWaterIndex(),raw.getImpurity(),raw.getRawId()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count; 
		}
		
		/**
		 * 查询原材料表的所有信息，按照指定字段
		 * @param ob   
		 * @return	 	一个Rawstore类的集合
		 * @throws SQLException
		 */
		public List<Rawstore> query(Object ob) throws SQLException {
			List<Rawstore> rawList=new ArrayList<>();
			String sql="select * from Rawstore order by ?";
			if(ob==null) {
				ob="proDate";
			}
			Object[] obs= {ob};
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, obs);
			while(rs.next()) {
				Rawstore raw=new Rawstore();
				raw.setRawId(rs.getString("rawId"));
				raw.setMatId(rs.getString("matId"));
				raw.setMatName(rs.getString("matName"));
				raw.setMetering(rs.getString("metering"));
				raw.setRawSpec(rs.getString("rawSpec"));
				raw.setBatchNumber(rs.getString("batchNumber"));
				raw.setRepId(rs.getString("repId"));
				raw.setRepName(rs.getString("repName"));
				raw.setProDate(rs.getString("proDate"));
				raw.setValDate(rs.getString("valDate"));
				raw.setExtantNum(rs.getDouble("extantNum"));
				raw.setOriginNumber(rs.getString("originNumber"));
				raw.setWaterIndex(rs.getString("waterIndex"));
				raw.setImpurity(rs.getString("impurity"));
				raw.setWaitCheck(rs.getDouble("waitCheck"));
				rawList.add(raw);
			}
			this.closeConnection();
			return rawList;
		}
		
		
		
		
		
		
		
		
}
