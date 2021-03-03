package com.xworkz.karnataka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlacesToVisitImpl implements KarnatakaDao {

	@Override
	public Connection getConnection()  {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/placesinkarnataka", "root", "Root123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	
	}

	@Override
	public void save(KarnatakaDto dto) {
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/placesinkarnataka";
		String username="root";
		String password="Root123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn=DriverManager.getConnection(url, username, password);
			String sqlQuery = "insert into usersdetails values(?,?,?,?,?);";
			PreparedStatement stmt = conn.prepareStatement(sqlQuery);
			stmt.setString(1, dto.getFirstname());
			stmt.setString(2, dto.getLastname());
			stmt.setString(3, dto.getPhno());
			stmt.setString(4, dto.getPassword());
			stmt.setString(5, dto.getEmail());

			int res = stmt.executeUpdate();
			System.out.println(res);
		} catch (Exception e) {
          e.printStackTrace();
		}

		//return;

	}

	@Override
	public boolean verifyMail() {
		return false;
	}

	@Override
	public boolean checkId(String emailId) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
