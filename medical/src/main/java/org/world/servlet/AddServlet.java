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
import org.world.entity.Purchasedetial;
import org.world.service.PurchaseService;
import org.world.service.PurchasedetialService;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
@WebServlet(name="addServlet",urlPatterns= {"/addServlet"})
public class AddServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	/*	String purId=req.getParameter("purId");
		String userId=req.getParameter("userId");
		String userName=req.getParameter("userName");
		String supName=req.getParameter("supName");
		String purTime=req.getParameter("purTime");
		String variety=req.getParameter("variety");
		String totalNumber=req.getParameter("totalNumber");
		String totalMoney=req.getParameter("totalMoney");
		System.out.println(purId);
		System.out.println(userId);
		System.out.println(variety);
		Purchase p=new Purchase();
		p.setPurId(purId);
		p.setUserId(userId);
		p.setUserName(userName);
		p.setSupName(supName);
		p.setPurTime(purTime);
		p.setVariety(Integer.parseInt(variety));
		p.setTotalNumber(Integer.parseInt(totalNumber));
		p.setTotalMoney(Double.parseDouble(totalMoney));
		PurchaseService ps=new PurchaseService();
		boolean bool=ps.addPurchase(p);
		resp.getWriter().println(bool?1:0);
		resp.getWriter().flush();
		
		
		String purId1=req.getParameter("purId");
		String supId=req.getParameter("supId");
		String matId=req.getParameter("matId");
		String matName=req.getParameter("matName");
		String matCategory=req.getParameter("matCategory");
		String matSpec=req.getParameter("matSpec");
		String metering=req.getParameter("metering");
		String unitPrice=req.getParameter("unitPrice");
		String quantity=req.getParameter("quantity");
		String expectDate=req.getParameter("expectDate");
		String amount=req.getParameter("amount");
		Purchasedetial pd=new Purchasedetial();
		pd.setPurId(purId1);
		pd.setSupId(supId);
		pd.setMatId(matId);
		pd.setMatName(matName);
		pd.setMatCategory(matCategory);
		pd.setMatSpec(matSpec);
		pd.setMetering(metering);
		pd.setUnitPrice(Double.parseDouble(unitPrice));
		pd.setQuantity(Integer.parseInt(quantity));
		pd.setExpectDate(expectDate);
		pd.setAmount(Double.parseDouble(amount));
		PurchasedetialService pds=new PurchasedetialService();
		boolean bool1=pds.addPurchasedetial(pd);
		resp.getWriter().println(bool1?1:0);;
		resp.getWriter().flush();*/
		
		String info=req.getParameter("info");
		ObjectMapper mapper=new ObjectMapper();
		JavaType jt=mapper.getTypeFactory().constructParametricType(List.class,Purchase.class);
		JavaType jt1=mapper.getTypeFactory().constructParametricType(List.class,Purchasedetial.class);
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
		List<Purchase> infoList1=mapper.readValue(info, jt);
		List<Purchasedetial> infoList=mapper.readValue(info, jt1);
//		Gson gson = new Gson();  
//		Purchasedetial pd = gson.fromJson(info, Purchasedetial.class);
		
//		 PurchasedetialService pds=new PurchasedetialService();
//		 boolean bool2=pds.addPurchasedetial(pd);
//		 resp.getWriter().println(bool2?1:0);;
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
		
		String purId1=req.getParameter("purId");
		String supId=req.getParameter("supId");
		List<Purchasedetial> purdList=new ArrayList<>();
		for(int j=0;j<infoList.size();j++) {
			Purchasedetial pd=infoList.get(j);
			pd.setPurId(purId1);
			pd.setSupId(supId);
			purdList.add(pd);
		}
		PurchasedetialService  pds=new PurchasedetialService();
		pds.addPurchasedetial(purdList);
		
		System.out.println(purId1);
//		p.setPurId(purId);
//		p.setPurTime(purTime);
//		p.setUserId(userId);
//		p.setUserName(userName);
//		p.setSupName(supName);
//		PurchaseService ps=new PurchaseService();
//		boolean bool=ps.addPurchase(p);
//		resp.getWriter().println(bool?1:0);
//		resp.getWriter().flush();
//		
		//String purId1=req.getParameter("purId");
		//Purchasedetial pd=new Purchasedetial();
		//pd.setSupId(supId);
		//pd.setPurId(purId1);
	   //PurchasedetialService pds=new PurchasedetialService();
		//boolean bool1=pds.addPurchasedetial(pd);
		//resp.getWriter().println(bool1?1:0);
		//resp.getWriter().flush();
	}

}