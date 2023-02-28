package sec01;

public class Circle extends Shape {
	private int radius;
	Point[] p;
	
	public Circle() {}
	
	public Circle(String name, int radius, Point[] p) {
		super(name, p);
		this.p = p;
		this.radius = radius;
	}
	
	int getRadius() {
		return radius;
	}
	
	String getPoint() {
		return "원점의 좌표는 (" + p[0].x + ", " + p[0].y + ")입니다.";
	}

}
