package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.PurGoods;
import org.world.model.Purchase;
import org.world.model.PurchaseGoods;
import org.world.model.Purchasedetial;
import org.world.model.PurchasedetialGoods;
import org.world.service.PurGoodsService;
import org.world.service.PurchaseGoodsService;
import org.world.service.PurchaseService;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name="purGoodsServlet",urlPatterns= {"/purGoodsServlet"})
public class PurGoodsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   req.setCharacterEncoding("utf-8");
		   resp.setCharacterEncoding("utf-8");
			ObjectMapper mapper=new ObjectMapper();
			PurchaseService ps=new PurchaseService();
			List<Purchase> list=ps.queryAll();
			String json=mapper.writeValueAsString(list);
			resp.getWriter().println(json);
			resp.getWriter().flush();
			resp.getWriter().close();
			}
}
	
	


