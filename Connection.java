package com.listeners;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Connection {
	static Statement stmt=null;
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	System.out.println("Driver loaded");
	String connectionUrl = "jdbc:sqlserver://ATMECSINDT-080\\SQLEXPRESS;database=Exercise;integratedSecurity=true;";

	java.sql.Connection con = DriverManager.getConnection(connectionUrl);
	System.out.println("connection established");
	  stmt =con.createStatement();

	ResultSet rs = stmt.executeQuery("select * from candidates1");
	  

	while (rs.next()) {
	System.out.println("id"+"name"+"city"+"age");
	System.out.println(
	rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));

	}
	stmt.close();
	con.close();
	}
	
	}

