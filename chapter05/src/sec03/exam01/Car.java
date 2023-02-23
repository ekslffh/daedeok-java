package sec03.exam01;

public class Car {
	
	private int num = 3;
	private String a = "¸£³ë";
	
	{
		num = 4;
	}
	
	public Car() {};
	public Car(int num) {
		this.num = num;
	}
	public Car(String a) {
		this.a = a;
	}
	public Car(int num, String a) {
		this.num = num;
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "num: " + num + ", a: " + a;
	}
	
	public static void main(String[] args) {
		Car car = new Car(2);
		System.out.println(car);
	}
	
}
