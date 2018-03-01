package org.world.servlet;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.entity.StoreGoods;
import org.world.entity.StoredetialGoods;
import org.world.service.StoreGoodsService;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name="storeGoodsServlet",urlPatterns= {"/storeGoodsServlet"})
public class StoreGoodsServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获得表格中的数据，使用json在转化为java对象
		String info=req.getParameter("info");
		ObjectMapper  mapper=new ObjectMapper();
		JavaType jt=mapper.getTypeFactory().constructParametricType(List.class, StoreGoods.class);
		JavaType jt1=mapper.getTypeFactory().constructParametricType(List.class,StoredetialGoods.class);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	   //将获得的表格中的数据放在集合里
		//入库主表
		List<StoreGoods> infoList=mapper.readValue(info, jt);
		String userId=req.getParameter("userId");
		String userName=req.getParameter("userName");
		String inStoreDate=req.getParameter("inStoreDate");
		List<StoreGoods> lgList=new ArrayList<>();
		for(int i=0;i<infoList.size();i++) {
			StoreGoods sg=infoList.get(i);
			sg.setUserId(userId);
			sg.setUserName(userName);
			sg.setInStoreDate(inStoreDate);
            lgList.add(sg);
            }
		StoreGoodsService lgs=new StoreGoodsService();
		lgs.addLibraryGoods(lgList);
		
		//入库明细表
		List<StoredetialGoods> infoList1=mapper.readValue(info,jt1);
		String purId=req.getParameter("purId");
		List<StoredetialGoods> sdgList=new ArrayList<>();
		for(int j=0;j<infoList1.size();j++) {
			StoredetialGoods sdg=infoList1.get(j);
			sdg.setPurId(purId);
			sdgList.add(sdg);
		}
		
		lgs.addStoredetialGoods(sdgList);
		}
}
