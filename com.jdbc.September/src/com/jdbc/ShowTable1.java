package com.jdbc;

import java.sql.*;;

public class ShowTable1 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/veera";
		String un = "root";
		String pass = "root";
		String query ="show tables";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection(url,un,pass);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getNString(1));
		}
		rs.close();	
	}
}
