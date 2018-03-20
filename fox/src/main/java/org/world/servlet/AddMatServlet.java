package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Acceptance;
import org.world.model.Purchase;
import org.world.model.Purchasedetial;
import org.world.service.AcceptanceService;
import org.world.service.PurchaseService;
import org.world.service.RawstoreService;
import org.world.utils.Utils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/addMatServlet")
public class AddMatServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String info=request.getParameter("info");
		String accDate=request.getParameter("accDate");
		
		AcceptanceService acc=new AcceptanceService();
		PurchaseService ps=new PurchaseService();
		RawstoreService rs=new RawstoreService();
		ObjectMapper mapper=new ObjectMapper();
		
		JavaType jt=mapper.getTypeFactory().constructParametricType(List.class,Purchasedetial.class);	
		List<Purchasedetial> infoList=mapper.readValue(info, jt);
		
		String accId=acc.getMaxId();
		String batchNumber=acc.getBatchNumber();
		if(accId==null) {
			accId=Utils.giveId("QGDH");
		}else {
			accId=Utils.giveId(accId);
		}
		if(batchNumber==null) {
			batchNumber=Utils.giveId("YLPH");
		}else {
			accId=Utils.giveId(batchNumber);
		}
		boolean bool=false;
		
		for(int i=0;i<infoList.size();i++) {
			Acceptance a=new Acceptance();
			String purId=infoList.get(i).getPurId();
			int matId=infoList.get(i).getMatId();
			a.setAccId(accId);
			a.setAccDate(accDate);
			a.setBatchNumber(batchNumber);
			a.setMatId(matId);
			a.setMatName(infoList.get(i).getMatName());
			a.setPurId(purId);
			a.setTotalNumber(infoList.get(i).getInStoreNumber());
			int count=ps.getArriveNumber(purId, matId)+infoList.get(i).getInStoreNumber();
			bool=ps.changeNumber(count, purId, matId);
			//再更改一下原材料表的到货请检量信息
			
			rs.change(count, matId);
			acc.add(a);
		}
		response.getWriter().println(bool?1:0);
		response.getWriter().flush();
		response.getWriter().close();
	}
	

}
