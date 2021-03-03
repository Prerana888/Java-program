package com.xworkz.karnataka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PlacesOfKarnataka extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("welcome");
		
	String htmlContent="<html>"
			+"<body>"
			+"<h3>WELCOME TO PLACES TO VISIT IN KARNATAKA</h3>"
			+"</body>"
			+"</html>";
	
	PrintWriter out=resp.getWriter();
	out.write(htmlContent);
//	RequestDispatcher redirectToHtmlPage=req.getRequestDispatcher("Registration.html");
//	redirectToHtmlPage.forward(req, resp);
}
}
