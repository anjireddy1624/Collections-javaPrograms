package com.jdbc;
import java.sql.*;
public class CreateTable1 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/veera";
		String un = "root";
		String pass = "root";
		String query =  "create table Emp"+
						"(Eid int(4),"
						+ "Name varchar(30),"
						+ "mNumber int(12),"
						+ "Age int)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,un,pass);
		Statement st = con.createStatement();
		
		int update = st.executeUpdate(query);
		System.out.println(update+"Roews are effected");
	}
}

