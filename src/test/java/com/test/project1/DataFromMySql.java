package com.test.project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataFromMySql {
	
	
    @Test
	public void dbTest() throws SQLException {

		String host = "localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/venkat","root","sriram4254");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select* from sampleTable1 where name='sid';");
		
		while (rs.next()) {
			
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("Address"));
			System.out.println(rs.getInt("num"));
			
		}
		

		

	}
}
