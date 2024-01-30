package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo extends Submissions {

	private String fileName;
	private String photoName;
	
	
	public Photo(String userName, LocalDate timestamp, int like, ArrayList<Comment> comment) {
		super(userName, timestamp, like, comment);
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
	
	
	
}
