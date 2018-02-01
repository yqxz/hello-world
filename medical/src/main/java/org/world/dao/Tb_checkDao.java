package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Tb_check;

public class Tb_checkDao extends DBManager{

		/**
		 * ������-->���һ�������鵥�����Ϣ
		 * @param tb
		 * @return
		 * @throws SQLException
		 */
		public int insert(Tb_check tb) throws SQLException {
			String sql="insert into Tb_check(cheId,batchNumber,matId,matName,purId) values(?,?,?,?,?)";
			Object[] obs= {tb.getCheId(),tb.getBatchNumber(),tb.getMatId(),tb.getMatName(),
					tb.getPurId()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}

		/**
		 * ��д�����������ˮ��  ����  ���ȼ�����Ϣ
		 * @param tb
		 * @return
		 * @throws SQLException
		 */
		public int update(Tb_check tb) throws SQLException {
			String sql="update Tb_check set waterIndex=?,impurity=?,grade=? where cheId=?";
			Object[] obs= {tb.getWaterIndex(),tb.getImpurity(),tb.getGrade(),tb.getCheId()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		/**
		 * ��ѯ����δ����Ķ���
		 * @return
		 * @throws SQLException
		 */
		@SuppressWarnings("all")
		public List<Tb_check> queryAll() throws SQLException{
			List<Tb_check> tbList=new ArrayList<>();
			String sql="select cheId,batchNumber,matId,matName,purId from Tb_check where grade='δ��д'";
//			String sql="select * from Tb_check where grade='δ��д'";
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, null);
			while(rs.next()) {
				Tb_check tb=new Tb_check();
				tb.setCheId(rs.getString("cheId"));
				tb.setBatchNumber(rs.getString("batchNumber"));
				tb.setCheId(rs.getString("cheId"));
				tb.setMatName(rs.getString("matName"));
				tb.setPurId(rs.getString("purId"));
				tbList.add(tb);
			}
			this.closeConnection();
			return tbList;
 		}
		
		
		
		
		
		
		
		
		
		
		
		
}
