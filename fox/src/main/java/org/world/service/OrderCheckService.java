package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.OrderCheckDao;
import org.world.model.OrderCheck;

public class OrderCheckService {
	public List<OrderCheck> loadPur() {
		OrderCheckDao ocd=new OrderCheckDao();
		List<OrderCheck> orderList=null;
		try {
			orderList=ocd.loadPurchase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderList;
	}

}
