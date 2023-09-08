package com.jsp.crudoperation.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Update1 {
	
	public static void main(String[] args) throws SQLException{
	
		Driver drier = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(drier);
		
		Connection con = DriverManager.getConnection("");
		Statement st = con.createStatement();
		
		
	}

}
