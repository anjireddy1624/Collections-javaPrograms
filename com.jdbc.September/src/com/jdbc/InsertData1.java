package com.jdbc;
import java.sql.*;
public class InsertData1 {

	public static void main(String[] args) throws Exception 
	{
		String url = "jdbc:mysql://localhost:3306/veera";
		String un = "root";
		String pass = "root";
		int eid = 101;
		String name = "veeranji";
		long number = 846591l;
		int age = 24;
		String query = "insert into emp values (?,?,?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,un,pass);
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setInt(1,eid);
		pst.setString(2, name);
		pst.setLong(3, number);
		pst.setInt(4, age);
		
		int update = pst.executeUpdate();
		
		System.out.println(update+" Rows are effected");
		
	}

}
