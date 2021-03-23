package com.xworkz.registercheck;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.xworkz.registercheck.dao.RegisterDAO;
import com.xworkz.registercheck.daoimpl.RegisterDAOImpl;
import com.xworkz.registercheck.dto.RegisterDTO;

public class registercheck extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("invoked");
		String firstName = request.getParameter("fname");
		String LastName = request.getParameter("lname");
		String Gender = request.getParameter("lname");
		String PhoNO = request.getParameter("gender");
		String DOB = request.getParameter("date");
		String Email = request.getParameter("email");
		String Password = request.getParameter("passw");
		String Address = request.getParameter("address");
		String City = request.getParameter("city");
		String State = request.getParameter("state");
		System.out.println(firstName);
		System.out.println(LastName);
		System.out.println(Gender);
		System.out.println(PhoNO);
		System.out.println(DOB);
		System.out.println(Email);
		System.out.println(Password);
		System.out.println(City);
		System.out.println(State);
		RegisterDTO regDTO = new RegisterDTO(firstName, LastName, Gender, DOB, Email, Password, Address, City, State);

		RegisterDAO dao = new RegisterDAOImpl();

		RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.html");
		dispatcher.forward(request, response);
	}
}
