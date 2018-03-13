package org.world.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Supplier;
import org.world.service.SupplierService;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(urlPatterns= {"/supInfoServlet"})
@SuppressWarnings("serial")
public class SupInfoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		SupplierService ss=new SupplierService();
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		int count=ss.getCount();
		List<Supplier> list=ss.getLimit(page, rows);
		ObjectMapper mapper=new ObjectMapper();
		Map<String,Object> maps=new HashMap<String,Object>();
		maps.put("total", count);
		maps.put("rows",list);
		String jsonStr=mapper.writeValueAsString(maps);
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
