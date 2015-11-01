package com.user.arvind.action;
import java.sql.SQLException;
import java.util.ArrayList;

import com.user.arvind.DAO.*;
public class NewRegister {
	private String username;
	private String email;
	private String password;
	private ArrayList<String> SongList;
	
	public String execute() throws ClassNotFoundException, SQLException {
		//System.out.println(this.email+"  "+ this.password+"  "+ this.username );
		Register reg = new Register();
		boolean temp = reg.RegisterNew(this.username, this.email, this.password);
		if(temp){
			SongsList list = new SongsList();
			String xyz = list.execute();
			SongList = list.getSongList();
			return "SUCCESS";
		}
		return "FAILED";

	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<String> getSongList() {
		return SongList;
	}
	public void setSongList(ArrayList<String> songList) {
		SongList = songList;
	}
}
