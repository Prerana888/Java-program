package com.xworkz.karnataka;

import java.sql.SQLException;

import java.sql.Connection;

public interface KarnatakaDao {
public Connection getConnection() throws SQLException;
public boolean verifyMail();
public void save(KarnatakaDto dto);
public boolean checkId(String emailId);
}
