package geoMetry;

import java.util.ArrayList;


public class Group {

	private ArrayList<Body> bodies;
	
	public Group() {
	this.bodies = new ArrayList<Body>();
	}
	
	public void addBodie(Body body) {
		this.bodies.add(body);
	}
	
	public void removeBody(Body body) {
		this.bodies.remove(body);
	}
	
	
	public double overallArea() {
		double area = 0;
		for(Body b : this.bodies) {
			area += b.area();
		}
		return area;
	}
	
	
	public double overallcircumfances() {
		double circumfance = 0;
		for(Body b : this.bodies) {
			circumfance += b.circumfances();
		}
		return circumfance;
	}
	
	public void printBody() {
		for(Body b : this.bodies) {
			System.out.println(b);
		}
	}
	
	public double highestArea() {
		double max = 0;
		Body maxBody = this.bodies.get(0);
		for(Body b : this.bodies) {
			if(b.area()>max) {
				maxBody = b;
			
			}
		}	System.out.println("Biggest Body:" + maxBody.toString()); 
		return max;
	}
	

	
}
