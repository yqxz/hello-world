package org.world.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.SalePlan;
import org.world.model.Saleplandetial;
import org.world.service.AddSalePlanService;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name = "addSalePlanServlet", urlPatterns = { "/addSalePlanServlet" })
public class AddSalePlanServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 销售计划主表
		String spId = request.getParameter("spId");
		System.out.println(spId);
		int variety = Integer.parseInt(request.getParameter("variety"));
		int totalNumber = Integer.parseInt(request.getParameter("totalNumber"));
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String beginDate = request.getParameter("beginDate");
		String endDate = request.getParameter("endDate");

		SalePlan sp = new SalePlan();
		sp.setSpId(spId);
		sp.setVariety(variety);
		sp.setTotalNumber(totalNumber);
		sp.setUserId(userId);
		sp.setUserName(userName);
		sp.setBeginDate(beginDate);
		sp.setEndDate(endDate);

		List<SalePlan> salePlanList = new ArrayList<SalePlan>();
		salePlanList.add(sp);
		AddSalePlanService spas = new AddSalePlanService();
		spas.addSalePlan(salePlanList);


		// 销售计划明细
		ObjectMapper map = new ObjectMapper();
		String info = request.getParameter("info");
		JavaType jt = map.getTypeFactory().constructParametricType(List.class, Saleplandetial.class);
		map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		List<Saleplandetial> infoList = map.readValue(info, jt);
		List<Saleplandetial> salePlandetialList = new ArrayList<Saleplandetial>();
		for (int i = 0; i < infoList.size(); i++) {
			Saleplandetial spd = infoList.get(i);
			spd.setSpId(spId);
			salePlandetialList.add(spd);
		}
		spas.addSalePlanDetial(salePlandetialList);
	}
}
