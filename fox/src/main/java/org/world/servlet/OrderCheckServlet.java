package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.OrderCheck;
import org.world.service.OrderCheckService;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name="orderCheckServlet",urlPatterns= {"/orderCheckServlet"})
public class OrderCheckServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	OrderCheckService ocs=new OrderCheckService();
	List<OrderCheck> orderList=ocs.loadPur();
	ObjectMapper mapper=new ObjectMapper();
	String jsonStr=mapper.writeValueAsString(orderList);
	resp.setCharacterEncoding("utf-8");
	resp.getWriter().println(jsonStr);
	System.out.println(jsonStr);
	resp.getWriter().flush();
	resp.getWriter().close();
}
}
