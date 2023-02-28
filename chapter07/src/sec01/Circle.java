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
		return "������ ��ǥ�� (" + p[0].x + ", " + p[0].y + ")�Դϴ�.";
	}

}
