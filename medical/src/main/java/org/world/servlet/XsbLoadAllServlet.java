package org.world.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.business.SaleorderdetialService;
import org.world.model.Saleorderdetial;

import com.fasterxml.jackson.databind.ObjectMapper;


public class XsbLoadAllServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SaleorderdetialService ss = new SaleorderdetialService();
		List<Saleorderdetial> list = ss.loadAll();
		
		
		ObjectMapper mapper = new ObjectMapper();
		Map<String,Object> map = new HashMap<>();
		map.put("rows", list);
		String jsonStr = mapper.writeValueAsString(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
