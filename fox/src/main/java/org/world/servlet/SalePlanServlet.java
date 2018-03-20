package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Saleplandetial;
import org.world.service.SaleplandetialService;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/salePlanServlet")
public class SalePlanServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		SaleplandetialService ss=new SaleplandetialService();
		List<Saleplandetial> list=ss.loadAll();
		ObjectMapper map=new ObjectMapper();
		String json=map.writeValueAsString(list);
		response.getWriter().println(json);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
