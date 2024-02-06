package socialnetwork;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Submissions> submission;
	
	
	
	
	public NewsFeed(ArrayList<Submissions> submission) {
		this.submission = new ArrayList<Submissions>();
		// TODO Auto-generated constructor stub
	}



/**
 * Method for adding submisssions to a List
 * @param s
 */
	public void addSubmisssion(Submissions s) {
		this.submission.add(s);
		}
	
/**
 * method for removing submissions from a list
 * @param s
 */
	public void removeSubmission(Submissions s) {
		this.submission.remove(s);
	}
	
	/**
	 * Method to get a submission form a Specified user
	 * @param user
	 */
	public void submissionsFromUser(String user) {
		for(Submissions s : this.submission) {
			if(s.getUserName().equals(user)) {
				System.out.println(user);
			}
		}
	}
	
/**
 * method to print all submission
 */
	public void printAllSubmissions() {
		for(Submissions s : this.submission) {
			System.out.println(s);
		}
	}
	 
	/**
	 * Method to get all the submissions from a user
	 * @param author
	 */
	 public void getSubmissionsFromUser(String author){
	     for(Submissions s : this.submission) {
	         if(s.getUserName().equals(author)) {
	             System.out.println(s);
	         }
	     }
	 }
	 
	 /**
	  * Method to remove the submissions from a user
	  * @param author
	  */
	 public void removeSubmissionFromUser(String author) {
		    for(Submissions s : this.submission) {
		        if(s.getUserName().equals(author)) {
		            this.submission.remove(s);}}}


	 

}
