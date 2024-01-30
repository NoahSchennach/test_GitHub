package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Message extends Submissions {

	public String message;

	
	
	
	public Message(String userName, LocalDate timestamp, int like, ArrayList<Comment> comment) {
		super(userName, timestamp, like, comment);
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
