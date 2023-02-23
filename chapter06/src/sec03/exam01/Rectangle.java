package sec03.exam01;

public class Rectangle {
	
	int x;
	int y;
	int height;
	int width;
	int radius;
	
	public Rectangle() {}
	
	public Rectangle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public Rectangle(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
}
