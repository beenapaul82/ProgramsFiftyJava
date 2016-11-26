package com.wbl.fiftyprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	public static void main(String[]args){
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "Minnu123";		 
		try {		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    if (conn != null) {
		        System.out.println("Connected");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}	
	}
	
