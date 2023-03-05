package sec07.question01;

public class Sphere extends SolidFigure {

	private int radius;
	private static final double PI = Math.PI;
	
	public Sphere(int x, int y, int z, int radius) {
		super(x, y, z);
		this.radius = radius;
	}

	@Override
	public void getVolume() {
		System.out.println("구의 부피 : " + ((4 / 3.0) * PI * radius * radius * radius));
	}

}
