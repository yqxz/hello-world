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
import org.world.service.UserService;
import org.world.utils.Utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		AddSalePlanService spas = new AddSalePlanService();
		ObjectMapper mapper=new ObjectMapper();
		UserService user=new UserService();
		String info=request.getParameter("info");
		JavaType jt1 = mapper.getTypeFactory().constructParametricType(List.class, SalePlan.class);
		JavaType jt2 = mapper.getTypeFactory().constructParametricType(List.class, Saleplandetial.class);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		List<SalePlan> infoList1=mapper.readValue(info, jt1);
		List<Saleplandetial> infoList2=mapper.readValue(info, jt2);
		double totalMoney=0;
		int totalNumber=0;
		int variety = 0;
		for(int i=0;i<infoList2.size();i++) {
			Saleplandetial sd=infoList2.get(i);
			totalNumber+=sd.getAmount();
			variety++;
			totalMoney+=sd.getUnitPrice()*sd.getAmount();
		}
		//单号自动增长
				String spId =spas.getMaxId();
				if(spId!=null) {
					spId=Utils.giveId(spId);//获得销售计划单号
				}else {
					spId=Utils.giveId("XSJH");
				}
		//计划主表
		String loginName=request.getParameter("loginName");
		String beginDate = request.getParameter("beginDate");
		int userId=user.getId(loginName);
		SalePlan sp=infoList1.get(0);
		sp.setSpId(spId);
		sp.setBeginDate(beginDate);
		sp.setVariety(variety);
		sp.setTotalNumber(totalNumber);
		sp.setTotalMoney(totalMoney);
		sp.setLoginName(loginName);
		sp.setUserId(userId);
		List<SalePlan> list1=new ArrayList<>();
		list1.add(sp);
		
		boolean bool=spas.addSalePlan(list1);
		//明细表
		List<Saleplandetial> list2=new ArrayList<>();
		if(bool){
			for(int i=0;i<infoList2.size();i++) {
				Saleplandetial sd=infoList2.get(i);
				sd.setSpId(spId);
				list2.add(sd);
			}
			spas.addSalePlanDetial(list2);
		}
		response.getWriter().println(bool?1:0);
		response.getWriter().flush();
		response.getWriter().close();


	}










}