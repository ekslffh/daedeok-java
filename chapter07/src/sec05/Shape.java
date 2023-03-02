package sec05;

/**
 *	문제2] 다음은 도형클래스와 실행 클래스 내용이다. 도형클래스를 상속받는
 *		  원(Circle), 삼각형(Triangle), 사각형(Rectangle)클래스를 생성하고
 *		  각 넓이를 구하는 getArea()를 Override 하시오. 
 */
public class Shape {
	public double getArea() {
		return 0;
	}	
}

class Circle extends Shape {
	private int radius;
	private static final double PI = Math.PI;
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return (PI * radius * radius);
	}
}

class Triangle extends Shape {
	private int width;
	private int height;
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return (width * height * 0.5);
	}
}

class Rectangle extends Shape {
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return (width * height);
	}
}
