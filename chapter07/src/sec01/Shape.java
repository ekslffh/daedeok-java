package sec01;

public class Shape {
	String name;
	Point[] p;

	Shape() {
		name = "�̸� ����";
	}

	Shape(String name, Point[] p) {
		this.name = name;
		this.p = p;
	}

	String getInfo() {
		return name;
	}
}
