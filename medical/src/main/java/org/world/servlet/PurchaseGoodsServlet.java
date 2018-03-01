package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.entity.Purchase;
import org.world.entity.PurchaseGoods;
import org.world.entity.Purchasedetial;
import org.world.entity.PurchasedetialGoods;
import org.world.service.PurchaseGoodsService;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name="purchaseGoodsServlet",urlPatterns= {"/purchaseGoodsServlet"})
public class PurchaseGoodsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
	//获得表格中的数据，然后使用json转化为java对象
	String info=req.getParameter("info");
	ObjectMapper mapper=new ObjectMapper();
	JavaType jt=mapper.getTypeFactory().constructParametricType(List.class,PurchaseGoods.class);
	JavaType jt1=mapper.getTypeFactory().constructParametricType(List.class,PurchasedetialGoods.class);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
	//到货主表中添加数据
    List<PurchaseGoods> infoList=mapper.readValue(info, jt);
	String accId=req.getParameter("accId");
	String accDate=req.getParameter("accDate");
	List<PurchaseGoods> goodsList=new ArrayList<>();
	for(int i=0;i<infoList.size();i++) {
		PurchaseGoods pg=infoList.get(i);
		pg.setAccId(accId);
		pg.setAccDate(accDate);
		goodsList.add(pg);
	}
	PurchaseGoodsService pgs=new PurchaseGoodsService();
	pgs.addPurchaseGoods(goodsList);
	
	
	//到货明细表中添加数据
	List<PurchasedetialGoods> infoList1=mapper.readValue(info,jt1);
	String purId=req.getParameter("purId");
	String supName=req.getParameter("supName");
	String accd=req.getParameter("accId");
	List<PurchasedetialGoods> detialGoodsList=new ArrayList<>();
	for(int j=0;j<infoList1.size();j++) {
		PurchasedetialGoods pdg=infoList1.get(j);
		pdg.setPurId(purId);
		pdg.setSupName(supName);
		pdg.setAccId(accd);
		detialGoodsList.add(pdg);
	   }
	//PurchasedetialGoodsService pdgs=new PurchasedetialGoodsService();
	pgs.addPurchasedetialGoods(detialGoodsList);
	}
}
	
	


