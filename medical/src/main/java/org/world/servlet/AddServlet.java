package org.world.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.entity.Purchase;
import org.world.entity.Purchasedetial;
import org.world.service.PurchaseService;
import org.world.service.PurchasedetialService;
@WebServlet(name="addServlet",urlPatterns= {"/addServlet"})
public class AddServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String purId=req.getParameter("purId");
		String userId=req.getParameter("userId");
		String userName=req.getParameter("userName");
		String supName=req.getParameter("supName");
		String purTime=req.getParameter("purTime");
		String variety=req.getParameter("variety");
		String totalNumber=req.getParameter("totalNumber");
		String totalMoney=req.getParameter("totalMoney");
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
		ps.addPurchase(p);
		
		
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
		pds.addPurchasedetial(pd);
		
		
		
		
		
	}
	



}
