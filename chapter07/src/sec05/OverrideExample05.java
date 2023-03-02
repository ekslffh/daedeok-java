package sec05;

public class OverrideExample05 {

	public static void main(String[] args) {

		Circle c  = new Circle(16);
		System.out.println("¿øÀÇ ³ĞÀÌ: " + c.getArea());
		
		Triangle t = new Triangle(12, 5);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ: " + t.getArea());
		
		Rectangle r = new Rectangle(12, 10);
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ: " + r.getArea());
		
	}

}
