package geoMetry;

import java.util.ArrayList;
import java.util.Collections;

public class Group {

	ArrayList<Body> bodies = new ArrayList<Body>();
	
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
		for(Body b : this.bodies) {
			if(b.area()>max) {
				max = b.area();
				System.out.println("Biggest Body:" + b.toString());
			}
		} return max;
	}
	

	
}
