package socialnetwork;

import java.util.ArrayList;

public abstract class Submissions {
	
	private String userName;
	private long timestamp;
	private int like;
	private ArrayList<Comment> comment;
	
	public void giveLike() {
		like = this.like + 1;
	}
	public abstract void giveComment();
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int likes) {
		this.like = likes;
	}
	
	

	
}
