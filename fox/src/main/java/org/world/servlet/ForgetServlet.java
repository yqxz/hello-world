package org.world.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.User;
import org.world.service.UserService;

@WebServlet(urlPatterns="/forgetServlet")
public class ForgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		UserService us=new UserService();
		String loginName=request.getParameter("loginName");
		String userPwd=request.getParameter("userPwd");
		boolean bool=false;
		if(user!=null) {
			bool=us.changePwd(userPwd, loginName);
		}
		response.getWriter().print(bool==true?1:0);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
