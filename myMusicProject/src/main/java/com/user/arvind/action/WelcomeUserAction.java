package com.user.arvind.action;
import java.sql.SQLException;
import java.util.ArrayList;

import com.user.arvind.DAO.*;
public class WelcomeUserAction {
	private String username = "hello";
	 private String email;
	 private String password;
	 private ArrayList<String> SongList;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// all struts logic here
	public String execute() throws ClassNotFoundException, SQLException {
		Validate val = new Validate();
		boolean temp = val.ValidateUser(this.email,this.password);
		if(temp){
			SongsList list = new SongsList();
			String xyz = list.execute();
			SongList = list.getSongList();
			//System.out.println("authenticated!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return "SUCCESS";
		}
			
		return "FAILED";

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<String> getSongList() {
		return SongList;
	}

	public void setSongList(ArrayList<String> songList) {
		SongList = songList;
	}

}
