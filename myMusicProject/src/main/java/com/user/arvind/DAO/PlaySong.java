package com.user.arvind.DAO;
/*import javax.media.*;*/
import java.sql.SQLException;
import java.util.ArrayList;
import java.io.File;

import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.io.FileUtils;
import java.io.IOException; 

public class PlaySong {
	private ArrayList<String> SongList;
	private String score;
	private String SongSelected;

	private File myFile;
	private String myFileContentType;
	private String myFileFileName;
	private String destPath="/Users/arvindbeniwal/Documents/new Workspace/Struts2Example/src/main/webapp/";
	
	public String execute() throws IOException, ClassNotFoundException, SQLException {
		
		if(myFile != null){
			System.out.println("inside myFile");
			File destFile  = new File(destPath, myFileFileName);
			
			FileUtils.copyFile(myFile,destFile);
			File x = new File(destPath+myFileFileName);
			myFile.renameTo(x);
			//FileUtils.copyFile(myFile,destFile);

	/*		File destDir = new File(destPath);

			File x = new File(destPath+myFileFileName);
			//System.out.println("renamed to: "+myFile.getName());
			FileUtils.copyFileToDirectory(myFile, destDir);
			System.out.println(myFile.getName().toString());
			File copiedFile = new File(destPath + myFile.getName());
			copiedFile.renameTo(x);*/
			
			if (myFileFileName.length() > 4) {
				myFileFileName = myFileFileName.substring(0, myFileFileName.length()-4);
			    }
			System.out.println("file not null !!!!");
			UpdateDB temp = new UpdateDB();
			temp.UpdateList(myFileFileName);
		}
		if(score!=null){
			System.out.println("score: " + score);
			UpdateDB temp = new UpdateDB();
			temp.UpdateScore(SongSelected, score);
			score=null;
		}
		
		
		SongsList list = new SongsList();
		String xyz = list.execute();
		SongList = list.getSongList();

		return "success";
	}

	
	public ArrayList<String> getSongList() {
		return SongList;
	}
	public void setSongList(ArrayList<String> songList) {
		SongList = songList;
	}
	public String getSongSelected() {
		return SongSelected;
	}
	public void setSongSelected(String songSelected) {
		SongSelected = songSelected;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}
	public String getMyFileContentType() {
		return myFileContentType;
	}
	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}
	public String getMyFileFileName() {
		return myFileFileName;
	}
	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
}
