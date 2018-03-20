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
		 * ���һ��������Ϣ������
		 * @param raw
		 * @return
		 * @throws SQLException
		 */
		public int insert(Rawstore raw) throws SQLException {
			String sql="insert into Rawstore values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			Object[] obs= {raw.getRawId(),raw.getMatId(),raw.getMatName(),raw.getMetering(),raw.getSpec(),
				raw.getBatchNumber(),raw.getRepName(),raw.getProDate(),
				raw.getExtantNum(),raw.getWaitCheck()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		/**
		 * �������������¶�Ӧ�Ŀ����Ϣ
		 * @param raw
		 * @return
		 * @throws SQLException
		 */
		public int update(double waitCheck,int matId) throws SQLException {
			String sql="update Rawstore set waitCheck=? where matId=?";
			Object[] obs= {waitCheck,matId};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count; 
		}
		
		/**
		 * ��ѯԭ���ϱ��������Ϣ������ָ���ֶ�
		 * @param ob   
		 * @return	 	һ��Rawstore��ļ���
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
				raw.setMatId(rs.getInt("matId"));
				raw.setMatName(rs.getString("matName"));
				raw.setMetering(rs.getString("metering"));
				raw.setSpec(rs.getString("rawSpec"));
				raw.setBatchNumber(rs.getString("batchNumber"));
				raw.setRepName(rs.getString("repName"));
				raw.setProDate(rs.getString("proDate"));
				raw.setExtantNum(rs.getDouble("extantNum"));
				raw.setWaitCheck(rs.getDouble("waitCheck"));
				rawList.add(raw);
			}
			this.closeConnection();
			return rawList;
		}
		
		
		
		
		
		
		
		
}
