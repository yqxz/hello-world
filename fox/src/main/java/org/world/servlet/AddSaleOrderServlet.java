package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Drug;
import org.world.model.Saleorder;
import org.world.model.Saleorderdetial;
import org.world.service.AddSaleOrderService;
import org.world.service.DrugService;
import org.world.service.UserService;
import org.world.utils.Utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		  ObjectMapper map = new ObjectMapper();
	       String jsonStr = request.getParameter("info");
		AddSaleOrderService soas = new AddSaleOrderService();
		UserService us=new UserService();
		DrugService drug=new DrugService();
		
	   JavaType jt = map.getTypeFactory().constructParametricType(List.class, Saleorderdetial.class);
	   map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	   List<Saleorderdetial> infoList = map.readValue(jsonStr, jt);
	   System.out.println(infoList);
		 int totalNumber=0;
		 for(int i=0;i<infoList.size();i++) {
			 totalNumber+=infoList.get(i).getNumber();
		 }
		 
		String soId = soas.getMaxId();//获得最大主键值
		String cusName = request.getParameter("cusName");
		String createDate = request.getParameter("createDate");
		String loginName=request.getParameter("loginName");
		int userId=us.getId(loginName);
		//实现主键自增
		if(soId==null) {
			soId=Utils.giveId("CGDH");
		}else {
			soId=Utils.giveId(soId);
		}
		Saleorder so = new Saleorder();
		so.setSoId(soId);
		so.setCusName(cusName);
		so.setCreatDate(createDate);
		so.setLoginName(loginName);
		so.setUserId(userId);
		so.setTotalNumber(totalNumber);
		List<Saleorder> saleOrderList = new ArrayList<Saleorder>();
		saleOrderList.add(so);
		boolean bool=soas.saleOrderAdd(saleOrderList);
		//销售订单明细表
     
      
		if(bool==true) {
		  List<Saleorderdetial> SaleorderdetialList = new ArrayList<Saleorderdetial>();
			for (int i = 0; i < infoList.size(); i++) {
				Saleorderdetial sod = infoList.get(i);
				sod.setSoId(soId);
				sod.setMetering(drug.queryById(sod.getDrugId()).getMetering());
				bool=SaleorderdetialList.add(sod);
			}
			soas.saleOrderdetialAdd(SaleorderdetialList);
		}
		response.getWriter().println(bool?1:0);
		response.getWriter().flush();
		response.getWriter().close();
	}
}
