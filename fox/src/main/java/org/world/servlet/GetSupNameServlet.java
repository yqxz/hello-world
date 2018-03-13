package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Supplier;
import org.world.service.SupplierService;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/getSupNameServlet"})
public class GetSupNameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		SupplierService ss=new SupplierService();
		List<Supplier> list=ss.queryAll();
		ObjectMapper mapper=new ObjectMapper();
		String jsonStr=mapper.writeValueAsString(list);
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
