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

import org.world.business.SalereturndetialService;
import org.world.model.Salereturndetial;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name = "salereturndetialServlet", urlPatterns = { "/salereturndetialServlet" })
public class SalereturndetialServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SalereturndetialService ss = new SalereturndetialService();
		List<Salereturndetial> list = ss.loadAll();

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", list);
		String jsonStr = mapper.writeValueAsString(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
