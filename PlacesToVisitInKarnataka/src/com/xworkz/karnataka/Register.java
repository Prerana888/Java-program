package com.xworkz.karnataka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.jdbc.Statement;

public class Register extends HttpServlet{

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	System.out.println("register");
	
	String firstName = req.getParameter("firstname");
	String lastName = req.getParameter("lastname");
	String phNo = req.getParameter("phno");
	String emailId = req.getParameter("email");
	String password = req.getParameter("password");
	System.out.println(firstName);
	System.out.println(lastName);
	System.out.println(phNo);
	System.out.println(emailId);
	System.out.println(password);
	//String outputHtml=null;
	//check if record exist in DB
	
	KarnatakaDto dto = new KarnatakaDto(firstName,lastName,phNo,emailId,password);
	KarnatakaDao dao =new PlacesToVisitImpl();
	if(dao.checkId(emailId)) {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("EmailRepeat.html");
		requestDispatcher.forward(req, resp);
//		outputHtml="<html>"
//				+"<body>"
//				+"<h1>"
//		+"SORRY YOU HAVE ALREDDY REGISTRED"
//				+"</h1>"
//		+"</body>"
//				+"</html>";
		
	}else {
		
		dao.save(dto);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("login");
		requestDispatcher.forward(req, resp);
		//System.out.println("LOGIN SUCCESFULLY");
	}
//	PrintWriter out=resp.getWriter();
//	out.write(outputHtml);
}

}
