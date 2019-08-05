package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String code,name;
		Connection connection=null;
		
		try
		{
		 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cgi123");

		Statement statement=connection.createStatement();
		System.out.println("enter the code");
		code=scanner.next();
		System.out.println("enter the name");
		name=scanner.next();
String sql="delete from employee where code='"+code+"'";
System.out.println(sql);
int n=statement.executeUpdate(sql);
		if(n>0) {
			System.out.println("record inserted with success");
		}
	    }finally
	    {
	        connection.close();
	    }
	    
	    }
	    }