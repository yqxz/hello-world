package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Purchase;
import org.world.model.Purchasedetial;
import org.world.service.PurchaseService;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name="addPurchaseServlet",urlPatterns= {"/addPurchaseServlet"})
public class AddPurchaseServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String info=req.getParameter("info");
		ObjectMapper mapper=new ObjectMapper();
		JavaType jt=mapper.getTypeFactory().constructParametricType(List.class,Purchase.class);
		JavaType jt1=mapper.getTypeFactory().constructParametricType(List.class,Purchasedetial.class);
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
		List<Purchase> infoList1=mapper.readValue(info, jt);
		List<Purchasedetial> infoList=mapper.readValue(info, jt1);
         //订单主表
		String purId=req.getParameter("purId");
		String purTime=req.getParameter("purTime");
		String userId=req.getParameter("userId");
		String userName=req.getParameter("userName");
		String supName=req.getParameter("supName");
		List<Purchase> purList=new ArrayList<>();
		for(int i=0;i<infoList1.size();i++) {
			Purchase p=infoList1.get(i);
			p.setPurId(purId);
			p.setPurTime(purTime);
			p.setUserId(userId);
			p.setUserName(userName);
			p.setSupName(supName);
			purList.add(p);
		}
		PurchaseService ps=new PurchaseService();
		ps.addPurchase(purList);
		System.out.println(purList);
		//订单明细表
		String purId1=req.getParameter("purId");
		String supId=req.getParameter("supId");
		List<Purchasedetial> purdList=new ArrayList<>();
		for(int j=0;j<infoList.size();j++) {
			Purchasedetial pd=infoList.get(j);
			pd.setPurId(purId1);
			pd.setSupId(supId);
			purdList.add(pd);
		}
	//	ps.addPurchasedetial(purdList);
		ps.addPurchasedetial(infoList);
	}

}