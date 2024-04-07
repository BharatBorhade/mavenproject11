package com.fourelementsoftech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CURD_DEMO {
	
	private String driver ="com.mysql.cj.jdbc.Driver";
	private String url ="jdbc:mysql://localhost:3306/curddemo";
	private String userName ="root";
	private String password="root";
	
	
	
	public void createTable() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		Connection connection =DriverManager.getConnection(url,userName,password);
		Statement stmt = connection.createStatement();
		stmt.execute("create table employee(id int primary key auto_increment,namr char(40),city char(40))");
		
		System.out.println("table create successsfully");
	
			
	}
	public void insertRecord() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		Connection connection =DriverManager.getConnection(url,userName,password);
		Statement stmt = connection.createStatement();
		stmt.execute("insert  into employee(name ,city)values ('bharat','sambhajinagar'),(prathmesh','kolhapur),('ritsh','dhule')");
		
		System.out.println("record inserted successsfully");
		stmt.close();
		connection.close();
		
	}

}
