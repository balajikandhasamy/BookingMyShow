package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/seasion.jsp")
public class seassionTracking1 extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String s1=req.getParameter("name");
	String s2=req.getParameter("phone_no");
//	System.out.println(s1);
//	System.out.println(s2);
	resp.getWriter().print(s1);
	resp.getWriter().print(s2);
}
}
