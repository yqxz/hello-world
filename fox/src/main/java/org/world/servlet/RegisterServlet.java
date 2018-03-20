package org.world.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.User;
import org.world.service.UserService;

/**
 * 处理新用户注册的请求
 * @author Administrator
 *
 */
@WebServlet(urlPatterns="/registerServlet")
@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		UserService us=new UserService();
		user.setLoginName(request.getParameter("loginName"));
		user.setUserPwd(request.getParameter("userPwd"));
		user.setUserPower(request.getParameter("userPower"));
		user.setUserName(request.getParameter("userName"));
		boolean bool=false;
		if(user!=null) {
			bool=us.add(user);
		}
		response.getWriter().print(bool==true?1:0);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
