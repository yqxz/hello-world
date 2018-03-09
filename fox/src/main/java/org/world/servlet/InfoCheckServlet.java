package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.InfoCheck;
import org.world.service.CheckService;

import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet(name="infoCheckServlet",urlPatterns= {"/infoCheckServlet"})
public class InfoCheckServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CheckService  icService=new CheckService();
		List<InfoCheck> list=icService.loadInfo();
		ObjectMapper mapper=new ObjectMapper();
		String infoJson=mapper.writeValueAsString(list);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().println(infoJson);
		resp.getWriter().flush();
		resp.getWriter().close();
		
		
	}
}


