package sec01;

public class ShapeExample {

	public static void main(String[] args) {
		
		Point[] p1 = {new Point(100,100)};
		Circle c1 = new Circle("��", 15, p1);
		System.out.println("�� ������ " + c1.getInfo() + "�̰�, �������� " + 
		c1.getRadius() + "�Դϴ�.");
		System.out.println(c1.getPoint());
		
		Shape s1 = new Shape();
//		System.out.println(s1.getInfo());
		
		Circle c2 = new Circle();
		System.out.println("�� ������ " + c2.getInfo());
		
	}

}
