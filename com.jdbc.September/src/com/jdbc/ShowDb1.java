package com.jdbc;
import java.sql.*;

public class ShowDb1 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306";
		String un = "root";
		String pass = "root";
		String query = "show databases";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,un,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		
		rs.close();
		
	}
}
