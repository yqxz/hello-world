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

import org.world.business.SaleplandetialService;
import org.world.model.Saleplandetial;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name = "jhLoadAllServlet", urlPatterns = { "/jhLoadAllServlet" })
public class JhLoadAllServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SaleplandetialService ss = new SaleplandetialService();
		List<Saleplandetial> listst = ss.loadAll();

		ObjectMapper mapper = new ObjectMapper();

		Map<String, Object> maps = new HashMap<>();
		maps.put("rows", listst);
		String jsonStr = mapper.writeValueAsString(maps);
		System.out.println(jsonStr);
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
