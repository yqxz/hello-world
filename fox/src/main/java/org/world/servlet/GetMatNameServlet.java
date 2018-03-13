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

import org.world.model.Material;
import org.world.service.MaterialService;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 动态加载数据库药品的下拉列表
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/getMatNameServlet"})
public class GetMatNameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		MaterialService ms=new MaterialService();
		List<Material> list=ms.getName();
		ObjectMapper mapper=new ObjectMapper();
		String jsonStr=mapper.writeValueAsString(list);
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
		response.getWriter().close();
	}

	
	
	
	
	
	
	
	
	
}
