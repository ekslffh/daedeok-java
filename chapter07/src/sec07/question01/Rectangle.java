package sec07.question01;

public class Rectangle extends PlaneFigure {

	private int width;
	private int length;
	
	public Rectangle(int x, int y, int width, int length) {
		super(x, y);
		this.width = width;
		this.length = length;
	}

	@Override
	public void getArea() {
		System.out.println("사각형의 넓이 : " + (width * length));
	}

}
