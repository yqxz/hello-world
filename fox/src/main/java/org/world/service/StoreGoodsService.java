package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.world.dao.StoreGoodsDao;
import org.world.model.StoreGoods;
import org.world.model.StoredetialGoods;

public class StoreGoodsService {
	StoreGoodsDao lgd=new StoreGoodsDao();
	//将核对完成的原料进行入库
	public int addLibraryGoods(List<StoreGoods> lgList) {
		int count=0;
		for(int i=0;i<lgList.size();i++) {
			try {
				lgd.goodsLibrary(lgList.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			count++;
		}
		return count;
	}
	
	
		
		public int addStoredetialGoods(List<StoredetialGoods> sdgList) {
			int count=0;
			for(int i=0;i<sdgList.size();i++) {
				try {
					lgd.storeGoods(sdgList.get(i));
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
				count++;
			}
			return count;
			}
	}

	


