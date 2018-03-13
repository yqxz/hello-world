package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.ProducingPlan;
import org.world.service.ProducingPlanSevice;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(name="producingplan",urlPatterns= {"/producingplan"})
public class producingplan extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String infor=req.getParameter("info");
		//System.out.println(infor);
		ObjectMapper mapper=new ObjectMapper();
		JavaType jt=mapper.getTypeFactory().constructParametricType(List.class,ProducingPlan.class);
//		System.out.println(jt);
//		Text akk=new Text();
//		akk.text();
		List<ProducingPlan> infoList=mapper.readValue(infor, jt);
		
		ProducingPlanSevice proPlan=new ProducingPlanSevice();
		proPlan.PlanUploadSevice(infoList);
	}

}
