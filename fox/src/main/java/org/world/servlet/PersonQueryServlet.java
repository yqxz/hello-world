package org.world.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Prostore;
import org.world.model.User;
import org.world.service.ProstoreService;
import org.world.service.UserService;

import com.fasterxml.jackson.databind.ObjectMapper;


@SuppressWarnings("serial")
public class PersonQueryServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		UserService us=new UserService();
		List<User> userList=us.queryAll(page,rows);
		int count=us.getCount();
		ObjectMapper mapper=new ObjectMapper();
		Map<String,Object> maps=new HashMap<String,Object>();
		maps.put("total", count);
		maps.put("rows",userList);
		String jsonStr=mapper.writeValueAsString(maps);
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
