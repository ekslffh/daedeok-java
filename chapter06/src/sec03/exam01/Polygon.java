package sec03.exam01;

public class Polygon {

	public static void main(String[] args) {

		Cylinder c1 = new Cylinder(5.6, new Circle(2.8));
		System.out.println("Cylinder ºÎÇÇ : " + c1.getVolume());
		
	}

}
