package sec07.question01;

public class Triangle extends PlaneFigure {

	private int width;
	private int height;
	
	public Triangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void getArea() {
		System.out.println("삼각형의 넓이 : " + (width * height * 0.5));
	}

}
