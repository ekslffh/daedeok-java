package sec03.exam01;

public class RectangleEx {

	public static void main(String[] args) {
		Rectangle circle = new Rectangle(100,100,15);
		
		Rectangle rec = new Rectangle(100,100,20,30);
		
		System.out.println("원의 넓비 : " + (circle.radius * circle.radius * 3.1415926));
		System.out.println("사각형의 넓이 : " + (rec.width * rec.height));
	}

}
