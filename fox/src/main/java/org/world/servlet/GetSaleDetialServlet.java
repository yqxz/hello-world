package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Material;
import org.world.model.Saleorderdetial;
import org.world.service.MaterialService;
import org.world.service.SaleorderdetialService;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/getSaleDetialServlet"})
public class GetSaleDetialServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String soId=request.getParameter("soId");
		SaleorderdetialService sd=new SaleorderdetialService();
		List<Saleorderdetial> list=sd.loadById(soId);
		ObjectMapper mapper=new ObjectMapper();
		String jsonStr=mapper.writeValueAsString(list);
		System.out.println(jsonStr);
		response.getWriter().println(jsonStr);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
