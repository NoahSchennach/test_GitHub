package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo extends Submissions {

	private String fileName;
	private String photoName;
	
	
	public Photo(String userName, String fileName , String photoName ) {
		super(userName);
		this.fileName = fileName;
		this.photoName = photoName;
		
		
		// TODO Auto-generated constructor stub
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	
	public String toString() {
		return "File name :" + this.fileName + "\t" + "User: " + this.userName + "\n"
				+ "photo name :" +this.photoName + "\t" + "User: " + this.userName;
	}
	
	
}
