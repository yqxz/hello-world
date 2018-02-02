package com.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Prostore;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.ProstoreService;
@WebServlet(urlPatterns="/extantNumServlet")
public class ExtantNumServlet extends HttpServlet{
 
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ProstoreService ps=new ProstoreService();
		List<Prostore> list=ps.extantNum();
//		request.getSession().setAttribute("list", list);
		//JSON����ת��
		ObjectMapper mapper=new ObjectMapper();
		Map<String,Object> maps=new HashMap<String,Object>();
//		maps.put("total", 10);
		maps.put("rows",list);
		String jsonStr=mapper.writeValueAsString(maps);
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
		response.getWriter().close();
	}
}
