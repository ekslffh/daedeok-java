package sec07.car;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new AICar();
		c1.run();
		
		Car c2 = new ManualCar();
		c2.run();
		
	}

}
