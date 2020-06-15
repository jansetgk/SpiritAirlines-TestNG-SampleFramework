package com.Spirit.testbase;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


import org.testng.annotations.Test;

public class JDBCconnectionPractice {

	String dbUsername = "janset";
	String dbPassword = "Asiye..12";
	// jdbc:type driver:host:port/name of the database
	String dbUrl = "jdbc:mysql://127.0.0.1:3306/sql_store";
	//String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	@Test
	public void getConnection() throws SQLException {
	
	//getting connection
	Connection conn= DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	
	//Getting metaData
	DatabaseMetaData dbData=conn.getMetaData();
	String dbName=dbData.getDatabaseProductName();
	String dbVersion=dbData.getDatabaseProductVersion();
	System.out.println("name of the database: "+dbName+" version od dataBase: "+dbVersion);
	
	//getting statement
	Statement st=conn.createStatement();
	
	//getting ResultSet
	ResultSet rset=st.executeQuery("select customer_id, first_name from customers");
	
	rset.next();
	String firsRowData=rset.getNString("first_name");
	System.out.println(firsRowData);
	
	//getting ResultsetMetaData
	ResultSetMetaData resultData=rset.getMetaData();
	int columnNumber=resultData.getColumnCount();
	String getColumn1Name=resultData.getColumnName(1);
	System.out.println("column number of the resultSet is: "+columnNumber);
	System.out.println("The name of the first column is: "+getColumn1Name);
	
	for (int i = 1; i <= columnNumber; i++) {
		String colName=resultData.getColumnName(i);
		System.out.println("the column "+i+" name is:"+colName);
	}
	
	
	//getting value from  ResultSet
	rset.next();
	String secondRowData=rset.getObject("first_name").toString();
	System.out.println(secondRowData);
	
	String data;
	int id;
	
	while(rset.next()) {
		data=rset.getNString("first_name").toString();
		id=rset.getInt("customer_id");
		
		System.out.println(id+" : "+data);
	}
	
	
	rset.close();
	st.close();
	conn.close();
	
	}	
}