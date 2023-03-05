package sec07.question01;

public abstract class PlaneFigure extends Shape {

	public PlaneFigure(int x, int y) {
		super(x, y);
	}
	
	public void print() {
		System.out.println("평면도형의 무게중심 좌표 : (" + x + ", " + y + ")");
	}

	public abstract void getArea();
	
}
