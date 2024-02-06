package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Message extends Submissions {

	public String message;

	
	
	
	public Message(String userName,  String message ,ArrayList<Comment> comment) {
		super(userName);
		this.message = message;
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "message :" + this.message +"User: " + this.userName;
	
}
