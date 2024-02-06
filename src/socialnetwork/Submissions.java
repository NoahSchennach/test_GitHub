package socialnetwork;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class Submissions {
	
	private String userName;
	private  LocalDate timestamp;
	private int like;
	private ArrayList<Comment> comment;
	
	
	
	

	public Submissions(String userName, LocalDate timestamp, int like, ArrayList<Comment> comment ) {
		super();
		this.userName = userName;
		this.timestamp = LocalDate.now();
		this.like = 0;
		this.comment = new ArrayList<Comment>();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Method for giving a like
	 */
	public void giveLike() {
		like = this.like + 1;
	
	/**
	 * Method for giving a comment
	 */
	}
	public void giveComment(Comment c) {
		this.comment.add(c);
		
	}
	/**
	 * Method for printing all the comment
	 */
	public void printAllComments() {
		for(Comment c : this.comment) {
			System.out.println(c);
		}
		
	}
	/**
	 * Method for calculating the time when a post was sent
	 * @return
	 */
	public long calculateTimeSpan() {
		long timeSpan = ChronoUnit.MINUTES.between(timestamp, LocalDate.now());
		
		if(timeSpan < 60) {
			return timeSpan;
		} else if(timeSpan > 60 && timeSpan <(60*24)) {
			timeSpan = ChronoUnit.HOURS.between(this.timestamp, LocalDate.now());
		} else if(timeSpan > (60*24) && timeSpan<(60*24*7)) {
			timeSpan = ChronoUnit.DAYS.between(this.timestamp, LocalDate.now());
			return timeSpan;
		} else if(timeSpan > (60*24*7) && timeSpan <(60*24*7*4)) {
			timeSpan = ChronoUnit.WEEKS.between(this.timestamp, LocalDate.now());
			return timeSpan;
		} else if(timeSpan > (60*24*7*4) && timeSpan<(60*24*7*4*12)) {
			timeSpan = ChronoUnit.MONTHS.between(this.timestamp, LocalDate.now());
			return timeSpan;
		} 
		return ChronoUnit.YEARS.between(this.timestamp, LocalDate.now());
		
		
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int likes) {
		this.like = likes;
	}
	
	

	
}
