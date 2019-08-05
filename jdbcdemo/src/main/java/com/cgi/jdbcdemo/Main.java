package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//try
		//{
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cgi123");
		System.out.println("connected");
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery("select code,name from test.employee");
		int n=statement.executeUpdate("Insert into employee VALUES('E0003','rajeh')");
		if(n>0) {
			System.out.println("record inserted with success");
		}
		
		
		
		
		
	}
}
	