package sec07.question01;

public class Circle extends PlaneFigure {

	private int radius;
	private static final double PI = Math.PI;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void getArea() {
		System.out.println("원의 넓이 : " + (PI * radius * radius));
	}

}
