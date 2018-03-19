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
import org.world.service.UserService;
import org.world.utils.Utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
@WebServlet(name="addPurchaseServlet",urlPatterns= {"/addPurchaseServlet"})
public class AddPurchaseServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String info=req.getParameter("info");
		ObjectMapper mapper=new ObjectMapper();
		UserService us=new UserService();
		JavaType jt=mapper.getTypeFactory().constructParametricType(List.class,Purchase.class);
		JavaType jt1=mapper.getTypeFactory().constructParametricType(List.class,Purchasedetial.class);
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
		List<Purchase> infoList1=mapper.readValue(info, jt);
		double totalMoney=0;
		int totalNumber=0;
		int count=0;
		List<Purchasedetial> infoList=mapper.readValue(info, jt1);
			for(int i=0;i<infoList.size();i++) {
				Purchasedetial pur=infoList.get(i);
				pur.setAmount(pur.getUnitPrice()*pur.getQuantity());
				totalMoney+=pur.getAmount();
				totalNumber+=pur.getQuantity();
				count++;
			}
		Purchase pc=infoList1.get(0);
		pc.setTotalMoney(totalMoney);
		pc.setTotalNumber(totalNumber);
		pc.setVariety(count);
         //订单主表
		String purTime=req.getParameter("purTime");
		String loginName=req.getParameter("loginName");
		System.out.println(loginName);
		int userId=us.getId(loginName);
		String supName=req.getParameter("supName");
		int supId=Integer.valueOf(req.getParameter("supId"));
		PurchaseService ps=new PurchaseService();
		
		//实现单号自增长
		String purId=ps.getMaxId();
		if(purId!=null) {
			 purId=Utils.giveId(purId);//获得采购订单号
		}else {
			purId=Utils.giveId("CGDH");
		}
		
		//主表加数据
		List<Purchase> purList=new ArrayList<>();
			Purchase p=infoList1.get(0);
			p.setPurTime(purTime);
			p.setUserId(userId);
			p.setUserName(loginName);
			p.setSupName(supName);
			p.setPurId(purId);
			purList.add(p);
		boolean bool=ps.addPurchase(purList);
		
		if(bool==true) {
			List<Purchasedetial> purdList=new ArrayList<>();
			for(int j=0;j<infoList.size();j++) {
				Purchasedetial pd=infoList.get(j);
				pd.setPurId(purId);
				pd.setSupId(supId);
				purdList.add(pd);
			}
			boolean bool1=ps.addPurchasedetial(purdList);
			System.out.println(purdList);
			System.out.println(bool1);
		}
		resp.getWriter().println(bool?1:0);
		resp.getWriter().flush();
		resp.getWriter().close();
	}
	

}