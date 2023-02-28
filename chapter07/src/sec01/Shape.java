package sec01;

public class Shape {
	String name;
	Point[] p;

	Shape() {
		name = "이름 없음";
	}

	Shape(String name, Point[] p) {
		this.name = name;
		this.p = p;
	}

	String getInfo() {
		return name;
	}
}
