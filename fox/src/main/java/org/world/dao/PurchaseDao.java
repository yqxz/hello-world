package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.Purchase;
import org.world.model.Purchasedetial;

public class PurchaseDao extends DBManager{
	public int addPurchase(Purchase p) throws SQLException {
		String sql="insert into purchase values(?,?,?,?,?,?,?,?)";
		System.out.println(p);
		Connection conn=this.openConnection();
		Object[] obs= {p.getPurId(),p.getUserId(),p.getUserName(),p.getSupName(),
				p.getPurTime(),p.getVariety(),p.getTotalNumber(),p.getTotalMoney()};
		int count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
		
	}
	public int addPurchasedetial(Purchasedetial pd) throws SQLException {
		int count=0;
		String sql="insert into purchasedetial values(?,?,?,?,?,?,?,default,default,?,?)";
		Connection conn=this.openConnection();
		Object[] obs= {pd.getPurId(),pd.getSupId(),pd.getMatId(),pd.getMatName(),
					pd.getMetering(),pd.getUnitPrice(),pd.getQuantity(),
						pd.getExpectDate(),pd.getAmount()};
			count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
	}

	/**
	 * 
	 * @return  获得最大的单号Id
	 * @throws SQLException
	 */
	@SuppressWarnings("all")
	public String getMaxId() throws SQLException {
		String sql="select MAX(purId) from purchase";
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, null);
		String strMax=null;
		if(rs.next()) {
			strMax=rs.getString(1);
		}
		this.closeConnection();
		//System.out.println("count-->"+strMax);
		return strMax;
	}
	
	public List<Purchase> select() throws SQLException{
		String sql="select * from purchase";
		Connection conn=this.openConnection();
		List<Purchase> list=new ArrayList<>();
		ResultSet rs=this.query(conn, sql, null);
		while(rs.next()) {
			Purchase p=new Purchase();
			p.setPurId(rs.getString("purId"));
			p.setUserId(rs.getInt("userId"));
			p.setUserName(rs.getString("userName"));
			p.setSupName(rs.getString("supName"));
			p.setPurTime(rs.getString("purTime"));
			p.setTotalNumber(rs.getInt("totalNumber"));
			p.setTotalMoney(rs.getDouble("totalMoney"));
			p.setVariety(rs.getInt("variety"));
			list.add(p);
		}
		this.closeConnection();
		return list;
	}
	public List<Purchasedetial> selectDetial(String purId) throws SQLException{
		String sql="select * from purchaseDetial where purId=?";
		Connection conn=this.openConnection();
		List<Purchasedetial> list=new ArrayList<>();
		ResultSet rs=this.query(conn, sql, purId);
		while(rs.next()) {
			Purchasedetial p=new Purchasedetial();
			p.setPurId(rs.getString("purId"));
			p.setSupId(rs.getInt("supId"));
			p.setMatId(rs.getInt("matId"));
			p.setMatName(rs.getString("matName"));
			p.setMetering(rs.getString("matName"));
			p.setUnitPrice(rs.getDouble("unitPrice"));
			p.setQuantity(rs.getInt("quantity"));
			p.setArriveNumber(rs.getInt("arriveNumber"));
			p.setInStoreNumber(rs.getInt("inStoreNumber"));
			p.setExpectDate(rs.getString("expectDate"));
			p.setAmount(rs.getInt("amount"));
			list.add(p);
		}
		this.closeConnection();
		return list;
	}
	
	public int changeNumber(Number a,String purId,int matId) throws SQLException {
		String sql="update purchaseDetial set arriveNumber=? where purId=? and matId=?";
		Connection conn=this.openConnection();
		Object[] obs= {a,purId,matId};
		int count=this.update(conn, sql, obs);
		this.closeConnection();
		return count;
	}
	
	
	public int getArriveNumber(String purId,int matId) throws SQLException {
		String sql="select arriveNumber from purchaseDetial where purId=? and matId=?";
		Connection conn=this.openConnection();
		Object[] obs= {purId,matId};
		int count=0;
		ResultSet rs=this.query(conn, sql, obs);
		if(rs.next()){
			count=rs.getInt(1);
		}
		this.closeConnection();
		return count;
	}
	
}
