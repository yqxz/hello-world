package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.PurCheck;
import org.world.service.PurCheckService;

import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet(name="purCheckServlet",urlPatterns= {"/purCheckServlet"})
public class PurCheckServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PurCheckService pcs =new PurCheckService();
		List<PurCheck> pcList=pcs.loadPurCheck();
		ObjectMapper mapper=new ObjectMapper();
		String infoJson=mapper.writeValueAsString(pcList);
		resp.getWriter().println(infoJson);
		resp.getWriter().flush();
		resp.getWriter().close();
	}

}
