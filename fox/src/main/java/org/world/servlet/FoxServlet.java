package org.world.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.User;
import org.world.service.UserService;

@WebServlet(urlPatterns="/foxServlet")
@SuppressWarnings("serial")
public class FoxServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String loginName=request.getParameter("loginName");
		String userPwd=request.getParameter("userPwd");
		UserService us=new UserService();
		User user=us.check(loginName, userPwd);
		if(user!=null) {
			response.getWriter().println(user.getUserPower());
		}else {
			response.getWriter().println("0");
		}
		response.getWriter().flush();
		response.getWriter().close();
	}

}
