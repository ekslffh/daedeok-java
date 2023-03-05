package sec07.question01;

public abstract class SolidFigure extends Shape {

	protected int z;
	
	public SolidFigure(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void print() {
		System.out.println("입체도형의 질량중심 좌표 : (" + x + ", " + y + ", " + z + ")");
	}
	
	public abstract void getVolume();
	
}
