package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String code,name;
		Connection connection=null;
		
		try
		{
		 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cgi123");
System.out.println("enter the code to be deleted");
code=scanner.next();
		 String sql="delete from employee where code=?";
		
		
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1,code);
		
System.out.println(sql);
int n=statement.executeUpdate();
		if(n>0) {
			System.out.println("record inserted with success");
		}
	    }finally
	    {
	        connection.close();
	    }
	    
	    }
	    }