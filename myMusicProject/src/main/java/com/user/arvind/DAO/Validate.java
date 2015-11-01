package com.user.arvind.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Validate {
	public boolean  ValidateUser(String email, String Password) throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/myMusic", "root", "root");
		String query = "SELECT password FROM myMusic.USERS WHERE email='"+email+"'" ;
		boolean result = false;
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			try {
				while(rs.next()){
					//Retrieve by column name
					String CorrectPass = rs.getString("password");
					if( CorrectPass.equals(Password)){
						result =  true;
					}
					System.out.println("Passwprd: " + CorrectPass);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
