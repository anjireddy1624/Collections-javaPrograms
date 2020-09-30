package com.jdbc;
import java.util.Scanner;
import java.sql.*;
public class FetchingData1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the query");
		String query = sc.nextLine();
		try
		{
			data("jdbc:mysql://localhost:3306/veera","root","root",query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void data(String url,String un,String pass,String query) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,un,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
		con.close();
		st.close();
		rs.close();	
	}
}
