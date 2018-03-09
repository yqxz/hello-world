package org.world.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.service.UserService;


@SuppressWarnings("serial")
public class CheckNameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginName=request.getParameter("loginName");
		UserService us=new UserService();
		boolean bool=us.cheakName(loginName);
		response.getWriter().print(bool?1:0);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
