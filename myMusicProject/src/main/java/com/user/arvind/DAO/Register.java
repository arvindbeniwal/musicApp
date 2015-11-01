package com.user.arvind.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {
	public boolean  RegisterNew(String name, String email, String Password) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/myMusic", "root", "root");
		
		String query = "SELECT email from myMusic.USERS where email='"+email+"'" ;
		String regQuery = "INSERT INTO myMusic.USERS (email,name,password) values (?, ?, ?)";
		PreparedStatement preparedStmt = con.prepareStatement(regQuery);
		 
	      preparedStmt.setString (1, email);
	      preparedStmt.setString (2, name);
	      preparedStmt.setString (3, Password);
	      
	     
		boolean result = false;
		try {

			Statement st = con.createStatement();
			Statement st2 = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			try {
			System.out.println("in try block baby ");
				if(!rs.next())
				{
					System.out.println("printing correct pass");
					
					 preparedStmt.execute();
						result = true;
					}else {
						System.out.println("in else ");
					}
					
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("in elseda vasd  ");
				e.printStackTrace();
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}

