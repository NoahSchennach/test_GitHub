package geoMetry;

import java.util.ArrayList;

public class Group {

	ArrayList<Body> body = new ArrayList<Body>();
	
	public void addBodie(Body body) {
		this.body.add(body);
	}
	
	public void removeBody(Body body) {
		this.body.remove(body);
	}
	
	
	public double overallArea() {
		double area = 0;
		for(Body b : this.body) {
			area += b.area();
		}
		return area;
	}
	
	
	public double overallcircumfances() {
		double circumfance = 0;
		for(Body b : this.body) {
			circumfance += b.circumfances();
		}
		return circumfance;
	}
	
	
	
}
