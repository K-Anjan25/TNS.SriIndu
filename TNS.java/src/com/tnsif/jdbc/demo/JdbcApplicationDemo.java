package com.tnsif.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApplicationDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			//1. Load & Register theDriver
			Class.forName("org.postgresql.Driver");
		    System.out.println("Driver loaded successfully.");

		    //2.Establish the connection
		    String url="jdbc:postgresql://localhost:5432/Employee_db";
		    String user="postgres";
		    String pass="root";
		    Connection con=DriverManager.getConnection(url,user,pass);
		    System.out.println("Connection established..");
		    //3.Create a statement
		    /*
		    String sql_insert_query="insert into employee values (?,?,?)";
		    PreparedStatement st=con.prepareStatement(sql_insert_query);
		    st.setInt(1, 102);
		    st.setString(2, "Ram");
		    st.setString(3, "Hyderabad");
		    
		    int rows=st.executeUpdate();
		    System.out.println(rows+" record inserted");*/
		    
		    Statement st=con.createStatement();
		    
		    //4.ResultSet
		    ResultSet rs=st.executeQuery("select * from employee");
		    
		    System.out.println("==== Employee Details =======");
		    while(rs.next()) {
		    	System.out.println("Emp Id : "+rs.getInt("empid")+" Emp Name : "+rs.getString("empname")+" Emp Address : "+rs.getString("empaddr"));
		    }
		    
		    //5.close statement
		    st.close();
		    //6.close connection
		    con.close();
	}

