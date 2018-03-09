package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Salereturn;
import org.world.model.Salereturndetial;
import org.world.service.AddSalereturnService;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name="addSalereturnServlet",urlPatterns= {"/addSalereturnServlet"})
public class AddSalereturnServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//销售退货主表
		 String stId=request.getParameter("stId");
		 String variety=request.getParameter("variety");
		 int totalNumber=Integer.parseInt(request.getParameter("totalNumber"));
		 String stDate=request.getParameter("stDate");
		 double totalMoney=Double.parseDouble(request.getParameter("totalMoney"));
		 String userId=request.getParameter("userId");
		 String userName=request.getParameter("userName");

		 Salereturn sr = new Salereturn();
		 sr.setStId(stId);
		 sr.setVariety(variety);
		 sr.setTotalNumber(totalNumber);
		 sr.setStDate(stDate);
		 sr.setTotalMoney(totalMoney);
		 sr.setUserId(userId);
		 sr.setUserName(userName);

		 List<Salereturn> salereturnList =  new ArrayList<Salereturn>();
		 salereturnList.add(sr);
		 AddSalereturnService asrs = new AddSalereturnService();
		 asrs.addSalereturn(salereturnList);

		 //销售退货明细表
		 ObjectMapper map = new ObjectMapper();
		 String jsonStr = request.getParameter("info");;
		    JavaType jt = map.getTypeFactory().constructParametricType(List.class, Salereturndetial.class);
			map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			List<Salereturndetial> infoList = map.readValue(jsonStr, jt);
			List<Salereturndetial> SalereturndetialList = new ArrayList<Salereturndetial>();
			 for (int i = 0; i < infoList.size(); i++) {
				 Salereturndetial srd = infoList.get(i);
				srd.setStId(stId);
				SalereturndetialList.add(srd);
				}
				asrs.addSalereturndetial(SalereturndetialList);
	}

}
