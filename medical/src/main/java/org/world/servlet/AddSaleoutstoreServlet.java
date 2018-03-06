package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.business.AddSaleoutstoreService;
import org.world.model.Saleoutstore;
import org.world.model.Sosdetial;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name="addSaleoutstoreServlet",urlPatterns= {"/addSaleoutstoreServlet"})
public class AddSaleoutstoreServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//销售出库单
		String sosId = request.getParameter("sosId");
		String soId=request.getParameter("soId");;
		String repName=request.getParameter("repName");
		int variety=Integer.parseInt(request.getParameter("variety"));
		int totalNumber=Integer.parseInt(request.getParameter("totalNumber"));
		String outStoreDate=request.getParameter("outStoreDate");
		String userId=request.getParameter("userId");
	    String userName=request.getParameter("userName");

	    Saleoutstore sos = new Saleoutstore();
	    sos.setSosId(sosId);
	    sos.setSoId(soId);
	    sos.setRepName(repName);
	    sos.setVariety(variety);
	    sos.setTotalNumber(totalNumber);
	    sos.setOutStoreDate(outStoreDate);
	    sos.setUserId(userId);
	    sos.setUserName(userName);

	    List<Saleoutstore> saleoutstoreList = new ArrayList<Saleoutstore>();
	    saleoutstoreList.add(sos);
	    AddSaleoutstoreService ats = new AddSaleoutstoreService();
	    ats.addSaleoutstore(saleoutstoreList);

	    //销售出库单明细表
	    ObjectMapper  map = new ObjectMapper();
	    String jsonStr = request.getParameter("info");;
	    JavaType jt = map.getTypeFactory().constructParametricType(List.class, Sosdetial.class);
		map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		List<Sosdetial> infoList = map.readValue(jsonStr, jt);
		List<Sosdetial> sosdetialList = new ArrayList<Sosdetial>();
		 for (int i = 0; i < infoList.size(); i++) {
			Sosdetial sod = infoList.get(i);
			sod.setSosId(sosId);
			sosdetialList.add(sod);
			}
			ats.addSosdetial(sosdetialList);

	}

}
