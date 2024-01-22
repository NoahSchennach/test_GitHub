package geoMetry;

public class Triangle extends Body{

	private double siteA;
	private double siteB;
	private double height;
	private double siteC;
	
	
	public Triangle(double x, double y,double siteA, double siteB, double height, double siteC) {
		this.setxCoordinate(x);
		this.setyCoordinate(y);
		this.siteA = siteA;
		this.siteB = siteB;
		this.height = height;
		this.siteC = siteC;
	}

	@Override
	public double circumfances() {
		return this.siteA + this.siteB + this.siteC;
	}
	
	@Override
	public double area() {
		return ((this.siteA /2)*this.height); 
	}


	public String toString() {
		return "Seite a: " + this.siteA + "\n" + 
				"Seite b: " + this.siteB + "\n" + "Seite c: " + this.siteC + "\n" + "Höhe: " + this.height;
		
}
	}
