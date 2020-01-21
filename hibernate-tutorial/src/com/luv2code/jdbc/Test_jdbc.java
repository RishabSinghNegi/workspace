package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test_jdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user= "hbstudent";
		String password= "hbstudent";
		try {
			System.out.println("connecting to db :" + jdbcUrl);
			Connection myConn= DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("connection successful");
		}
		
		catch(Exception E)
		{
			E.printStackTrace();
		}

	}

}
