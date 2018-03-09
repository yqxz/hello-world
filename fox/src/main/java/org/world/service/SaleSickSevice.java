package org.world.service;

import java.util.ArrayList;
import java.util.List;

import org.world.dao.SellDebtSickDao;


public class SaleSickSevice {
	private SellDebtSickDao resu=new SellDebtSickDao();
	public List saleSick() {
		List obs=new ArrayList();
		List res=new ArrayList();
		res=resu.salesPlan(obs);
		return res;
	}
	
}
