package sec07.question01;

public abstract class SolidFigure extends Shape {

	protected int z;
	
	public SolidFigure(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public abstract void getVolume();
	
}
