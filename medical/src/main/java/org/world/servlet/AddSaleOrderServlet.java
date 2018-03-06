package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.business.AddSaleOrderService;
import org.world.model.Saleorder;
import org.world.model.Saleorderdetial;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name="addSaleOrderServlet", urlPatterns ={ "/addSaleOrderServlet" })
public class AddSaleOrderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//销售订单主表
		String soId = request.getParameter("soId");
		int totalNumber = Integer.parseInt(request.getParameter("totalNumber"));
		double totalMoney = Double.parseDouble(request.getParameter("totalMoney"));
		double deposit = Double.parseDouble(request.getParameter("deposit"));
		String cusId = request.getParameter("cusId");
		String cusName = request.getParameter("cusName");
		String createDate = request.getParameter("createDate");
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		boolean state = Integer.parseInt(request.getParameter("state"))!=1?false:true;

		Saleorder so = new Saleorder();
		so.setSoId(soId);
		so.setTotalNumber(totalNumber);
		so.setTotalMoney(totalMoney);
		so.setDeposit(deposit);
		so.setCusId(cusId);
		so.setCudName(cusName);
		so.setCreatDate(createDate);
		so.setUserId(userId);
		so.setUserName(userName);
		so.setState(state);

		List<Saleorder> saleOrderList = new ArrayList<Saleorder>();
		saleOrderList.add(so);
		AddSaleOrderService soas = new AddSaleOrderService();
		soas.saleOrderAdd(saleOrderList);

		//销售订单明细表
       ObjectMapper map = new ObjectMapper();
       String jsonStr = request.getParameter("info");;
       JavaType jt = map.getTypeFactory().constructParametricType(List.class, Saleorderdetial.class);
	   map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	   List<Saleorderdetial> infoList = map.readValue(jsonStr, jt);
	   List<Saleorderdetial> SaleorderdetialList = new ArrayList<Saleorderdetial>();
		for (int i = 0; i < infoList.size(); i++) {
			Saleorderdetial sod = infoList.get(i);
			sod.setSoId(soId);
			SaleorderdetialList.add(sod);
		}
		soas.saleOrderdetialAdd(SaleorderdetialList);
		response.getWriter().println("1");
		}
}
