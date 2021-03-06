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

import org.world.model.Sosdetial;
import org.world.service.SosdetialService;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name = "sosdetialServlet", urlPatterns = { "/sosdetialServlet" })
public class SosdetialServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SosdetialService ss = new SosdetialService();
		List<Sosdetial> list = ss.loadAll();

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = new HashMap<>();
		map.put("rows", list);
		String JsonStr = mapper.writeValueAsString(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(JsonStr);
		response.getWriter().flush();
		response.getWriter().close();

	}

}
