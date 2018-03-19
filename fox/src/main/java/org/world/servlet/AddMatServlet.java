package org.world.servlet;

import java.io.IOException;
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
		String proDate=request.getParameter("date");
		AcceptanceService acc=new AcceptanceService();
		PurchaseService ps=new PurchaseService();
		ObjectMapper mapper=new ObjectMapper();
		JavaType jt=mapper.getTypeFactory().constructParametricType(List.class,Acceptance.class);	
		List<Acceptance> infoList=mapper.readValue(info, jt);
		String accId=acc.getMaxId();
		if(accId==null) {
			accId=Utils.giveId("RKDH");
		}else {
			accId=Utils.giveId(accId);
		}
		boolean bool=false;
		for(int i=0;i<infoList.size();i++) {
			infoList.get(i).setAccId(accId);
			infoList.get(i).setProDate(proDate);
			bool=acc.add(infoList.get(i));
			ps.changeNumber(infoList.get(i).getTotalNumber(), infoList.get(i).getPurId(), infoList.get(i).getMatId());
		}
		response.getWriter().println(bool?1:0);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
