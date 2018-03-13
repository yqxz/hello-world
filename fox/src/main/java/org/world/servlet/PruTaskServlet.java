package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.PlanInfo;
import org.world.model.Purchasedetial;
import org.world.service.PlanInfoService;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/pruTaskServlet"})
public class PruTaskServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String info=request.getParameter("info");
		System.out.println(info);
		String loginName=request.getParameter("loginName");
		ObjectMapper mapper=new ObjectMapper();
		JavaType jt=mapper.getTypeFactory().constructParametricType(List.class,PlanInfo.class);
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
		List<PlanInfo> infoList=mapper.readValue(info, jt);
		for(int i=0;i<infoList.size();i++) {
			infoList.get(i).setLoginName(loginName);
		}
		PlanInfoService ps=new PlanInfoService();
		boolean bool=ps.addPlanInfo(infoList);
		response.getWriter().println(bool?1:0);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
