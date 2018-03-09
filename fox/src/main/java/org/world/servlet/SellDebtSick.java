package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.service.SaleSickSevice;

import com.fasterxml.jackson.databind.ObjectMapper;


public class SellDebtSick extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	/**
	 * 处理销售计划查询业务处理
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SaleSickSevice se=new SaleSickSevice();
		List res=new ArrayList();
		res=se.saleSick();
		ObjectMapper mapper=new ObjectMapper();
		Map<String,Object> maps=new HashMap<>();
		maps.put("rows", res);
		String str=mapper.writeValueAsString(maps);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().println(str);
		resp.getWriter().flush();
		resp.getWriter().close();
	}

}
