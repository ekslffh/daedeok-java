package sec01;

public class ShapeExample {

	public static void main(String[] args) {
		
		Point[] p1 = {new Point(100,100)};
		Circle c1 = new Circle("원", 15, p1);
		System.out.println("이 도형은 " + c1.getInfo() + "이고, 반지름은 " + 
		c1.getRadius() + "입니다.");
		System.out.println(c1.getPoint());
		
		Shape s1 = new Shape();
//		System.out.println(s1.getInfo());
		
		Circle c2 = new Circle();
		System.out.println("이 도형은 " + c2.getInfo());
		
	}

}
