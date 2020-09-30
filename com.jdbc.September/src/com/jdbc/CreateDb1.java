package com.jdbc;
import java.sql.*;
public class CreateDb1 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306";
		String un = "root";
		String pass = "root";
		String query = "create database reddy";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,un,pass);
		Statement st = con.createStatement();
		int update = st.executeUpdate(query);
		
		System.out.println(update+"Rows are Effected....");
	}
}
