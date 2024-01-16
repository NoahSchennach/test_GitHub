package geoMetry;

public class Circle extends Body {

	private double radius;
	public final double pi = 3.14;
	
	public Circle (double x, double y, double radius) {
		this.setxCoordinate(x);
		this.setyCoordinate(y);
		this.radius = radius;
	}
	
	@Override
	public double circumfances() {
		return 2* this.pi *this.radius;
	}

	@Override
	public double area() {
		return this.pi * this.radius * this.radius;
	}
	

	
	
}
