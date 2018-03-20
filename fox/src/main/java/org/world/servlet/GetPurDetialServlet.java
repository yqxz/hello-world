package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Purchasedetial;
import org.world.service.PurchaseService;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/getPurDetialServlet")
public class GetPurDetialServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
		   resp.setCharacterEncoding("utf-8");
		   String purId=req.getParameter("purId");
			ObjectMapper mapper=new ObjectMapper();
			PurchaseService ps=new PurchaseService();
			List<Purchasedetial> list=new ArrayList<>();
			list=ps.queryDetialAll(purId);
			String json=mapper.writeValueAsString(list);
			resp.getWriter().println(json);
			resp.getWriter().flush();
			resp.getWriter().close();
	}

}
