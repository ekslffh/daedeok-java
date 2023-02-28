package sec04.point.controller;

import sec04.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	private static final double PI = Math.PI;
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return String.valueOf(PI * c.getRadius() * c.getRadius());
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return String.valueOf(2 * PI * c.getRadius());
	}
}
