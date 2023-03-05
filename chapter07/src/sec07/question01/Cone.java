package sec07.question01;

public class Cone extends SolidFigure {

	private int radius;
	private int	height;
	private static final double PI = Math.PI;
	
	public Cone(int x, int y, int z, int radius, int height) {
		super(x, y, z);
		this.radius = radius;
		this.height = height;
	}

	@Override
	public void getVolume() {
		System.out.println("원뿔의 부피 : " + ((1 / 3.0) * PI * radius * radius * height));
	}

}
