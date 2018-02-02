package org.world.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.business.SaleplandetialService;
import org.world.model.Saleplandetial;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SosdetialServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SaleplandetialService  ss = new SaleplandetialService();
		List<Saleplandetial> list = ss.loadAll();
		
		ObjectMapper mapper = new ObjectMapper();
		Map<String,Object> map = new HashMap<>();
	    map.put("rows", list);
		String JsonStr = mapper.writeValueAsString(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(JsonStr);
        response.getWriter().flush();
        response.getWriter().close();
		
	}

}
