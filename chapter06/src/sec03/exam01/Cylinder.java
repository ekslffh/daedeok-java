package sec03.exam01;

public class Cylinder {
	
	private double height;
	private Circle c;
	
	public Cylinder() {}
	
	public Cylinder(double height, Circle c) {
		this.height = height;
		this.c = c;
	}
	
	public double getVolume() {
		return height * c.getArea();
	}
	
}
