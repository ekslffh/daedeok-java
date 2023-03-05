package sec07.question01;

public abstract class Shape {
	// ��ǥ��
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void print();
	
}
