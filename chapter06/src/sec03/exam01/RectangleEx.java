package sec03.exam01;

public class RectangleEx {

	public static void main(String[] args) {
		Rectangle circle = new Rectangle(100,100,15);
		
		Rectangle rec = new Rectangle(100,100,20,30);
		
		System.out.println("���� �к� : " + (circle.radius * circle.radius * 3.1415926));
		System.out.println("�簢���� ���� : " + (rec.width * rec.height));
	}

}
