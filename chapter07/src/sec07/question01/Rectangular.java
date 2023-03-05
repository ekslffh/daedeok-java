package sec07.question01;

public class Rectangular extends SolidFigure {

	private int width;
	private int length;
	private int	height;
	
	
	public Rectangular(int x, int y, int z, int width, int length, int height) {
		super(x, y, z);
		this.width = width;
		this.length = length;
		this.height = height;
	}

	@Override
	public void getVolume() {
		System.out.println("직육면체의 부피 : " + (width * length * height));
	}

}
