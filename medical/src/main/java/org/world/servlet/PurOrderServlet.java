package org.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.world.model.Purchasedetial;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;


@WebServlet(name="purOrderServlet",urlPatterns="/purOrderServlet")
@SuppressWarnings("serial")
public class PurOrderServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String info=req.getParameter("info");
		ObjectMapper mapper=new ObjectMapper();
		JavaType jt=mapper.getTypeFactory().constructParametricType(List.class,Purchasedetial.class);
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
		List<Purchasedetial> infoList=mapper.readValue(info, jt);
		String purId=req.getParameter("purId");
		String purTime=req.getParameter("purTime");
		String userId=req.getParameter("userId");
		String userName=req.getParameter("userName");
		String supName=req.getParameter("supName");
		
	}

}
