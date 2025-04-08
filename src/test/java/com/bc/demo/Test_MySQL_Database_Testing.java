package com.bc.demo;

import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.Assert;

public class Test_MySQL_Database_Testing {

	private static String hostName = "localhost";
	private static String portNum = "3306";
	private static String dataBaseName = "/subidb";
	private static String userName = "root";
	private static String password = "admin123";
	
	
@Test
public void test_retrive_data() throws SQLException {
	Connection con = DriverManager.getConnection("jdbc:mysql://" + hostName + ":" + portNum + dataBaseName,userName, password);
	
	 // Retrieve and print data
    String sqlSelect = "SELECT * FROM adventEmp";
    Statement selectStmt = con.createStatement();
    ResultSet rs = selectStmt.executeQuery(sqlSelect);
    
    while (rs.next()) {
        System.out.println("\n ID         : " + rs.getInt("id") +
        		           "\n Name       : " + rs.getString("name") + 
        		           "\n Paystub    : " + rs.getDouble("paystub") +
        		           "\n Insurance  : " + rs.getDouble("insurance") + 
        		           "\n Male       : " + rs.getBoolean("male") + 
        		           "\n DateAndTime: " + rs.getTimestamp("dateAndTime"));
        
        Assert.assertEquals(rs.getString("name"), "Cavin");
    	System.out.println("Assertion passed! Page title contains: " + rs.getString("name"));
    	 
    	Assert.assertEquals(rs.getString("paystub"), "25");
    	System.out.println("Assertion passed! Page title contains: " + rs.getString("paystub"));
    }
	
}

	@Test
	public void test_updateSql() throws SQLException {
		// Open the database connection
      
		Connection con = DriverManager.getConnection("jdbc:mysql://" + hostName + ":" + portNum + dataBaseName,userName, password);
		String sql = "INSERT INTO adventEmp (name, id, paystub, insurance, male, dateAndTime) VALUES (?, ?, ?, ?, ?, NOW())";
        PreparedStatement stmt = con.prepareStatement(sql);

        // Set values
        stmt.setString(1, "Cavin");
        stmt.setInt(2, 100);
        stmt.setDouble(3, 25);
        stmt.setDouble(4, 100.75);
        stmt.setBoolean(5, true);

        // Execute query
        stmt.executeLargeUpdate();

        // Close connection
        stmt.close();
        con.close();
	}
}


