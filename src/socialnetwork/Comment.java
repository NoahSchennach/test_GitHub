package socialnetwork;

public class Comment {

	private String comment;
	private String user;
	
	
	
	public Comment(String comment, String user) {
		this.user = user;
		this.comment = comment;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	

	
	
}
