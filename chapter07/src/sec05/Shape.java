package sec05;

/**
 *	����2] ������ ����Ŭ������ ���� Ŭ���� �����̴�. ����Ŭ������ ��ӹ޴�
 *		  ��(Circle), �ﰢ��(Triangle), �簢��(Rectangle)Ŭ������ �����ϰ�
 *		  �� ���̸� ���ϴ� getArea()�� Override �Ͻÿ�. 
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
