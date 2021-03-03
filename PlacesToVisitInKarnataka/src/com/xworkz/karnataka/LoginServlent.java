package com.xworkz.karnataka;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlent extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Recived Request to login");
	RequestDispatcher redirecting=req.getRequestDispatcher("login.html");
	redirecting.forward(req, resp);
}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Recived Request to login");
	RequestDispatcher redirecting=req.getRequestDispatcher("login.html");
	redirecting.forward(req, resp);
}
}

