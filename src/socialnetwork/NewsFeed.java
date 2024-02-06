package socialnetwork;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Submissions> submission;
	
	
	
	
	public NewsFeed(ArrayList<Submissions> submission) {
		this.submission = new ArrayList<Submissions>();
		// TODO Auto-generated constructor stub
	}




	public void addSubmisssion(Submissions s) {
		this.submission.add(s);
		}
	
	public void removeSubmission(Submissions s) {
		this.submission.remove(s);
	}
	
	public void submissionsFromUser(String user) {
		for(Submissions s : this.submission) {
			if(s.getUserName().equals(user)) {
				System.out.println(user);
			}
		}
	}
	
	public void printAllSubmissions() {
		for(Submissions s : this.submission) {
			System.out.println(s);
		}
	}
	 
	 public void getSubmissionsFromUser(String author){
	     for(Submissions s : this.submission) {
	         if(s.getUserName().equals(author)) {
	             System.out.println(s);
	         }
	     }
	 }
	 
	 public void removeSubmissionFromUser(String author) {
		    for(Submissions s : this.submission) {
		        if(s.getUserName().equals(author)) {
		            this.submission.remove(s);}}}


	 

}
