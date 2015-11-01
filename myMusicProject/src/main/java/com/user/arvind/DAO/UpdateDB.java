package com.user.arvind.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB {
	
	public void UpdateScore(String name, String score) throws ClassNotFoundException, SQLException{
		System.out.println(score+" song: "+name);
		int inc=0;
		if(score.equals("Upvote")){
			System.out.println("inc=1");
			inc=1;
		}
		else if(score.equals("Downvote")){
			System.out.println("inc=-1");
			inc=-1;
		}
		else return;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/myMusic", "root", "root");
		String query = "SELECT score FROM myMusic.songs WHERE name='"+name+"'" ;
		//System.out.println(query);
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			try {
				while(rs.next()){
					//Retrieve by column name
					String CorrectScore = rs.getString("score");
					int CorScore = Integer.parseInt(CorrectScore);
					CorScore = CorScore + inc;
					
					String regQuery = "UPDATE myMusic.songs SET score=? WHERE name=?";
					PreparedStatement preparedStmt = con.prepareStatement(regQuery);
					 
				      preparedStmt.setInt (1, CorScore);
				      preparedStmt.setString (2, name);
				      //System.out.println(preparedStmt.toString());
				      preparedStmt.execute();

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void UpdateList(String name) throws ClassNotFoundException, SQLException{
		System.out.println("inside update: "+name);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/myMusic", "root", "root");
		
		
		String regQuery = "INSERT INTO myMusic.songs (name,score) values (?, ?)";
		PreparedStatement preparedStmt = con.prepareStatement(regQuery);
		 
	      preparedStmt.setString (1, name);
	      preparedStmt.setInt (2, 0);
	      System.out.println(preparedStmt.toString());
	      preparedStmt.execute();
	      //preparedStmt.setString (3, Password);
	}
}
