package com.user.arvind.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SongsList {
	private String name;
	private String department;

	public SongsList(){}
	public SongsList(String name,String department)
	{
		this.name = name;
		this.department = department;
	}
	private ArrayList<String> SongList;

	public String execute() throws ClassNotFoundException, SQLException {
		SongList = new ArrayList<String>();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/myMusic", "root", "root");
		String query = "SELECT name FROM myMusic.songs order by score asc";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		try {
			while(rs.next()){
				SongList.add(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con.close();
		return "success";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public ArrayList<String> getSongList() {
		return SongList;
	}
	public void setSongList(ArrayList<String> songList) {
		SongList = songList;
	}

}
