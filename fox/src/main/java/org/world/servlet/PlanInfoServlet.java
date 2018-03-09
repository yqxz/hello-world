package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.PlanInfo;
import org.world.service.PlanInfoService;

import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet(name="planInfoServlet",urlPatterns= {"/planInfoServlet"})
public class PlanInfoServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PlanInfoService ps=new PlanInfoService();
		List<PlanInfo> piList=ps.loadPlanInfo();
		ObjectMapper mapper=new ObjectMapper();
		String infoJson=mapper.writeValueAsString(piList);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().println(infoJson);
		resp.getWriter().flush();
		resp.getWriter().close();
	}
	

}
