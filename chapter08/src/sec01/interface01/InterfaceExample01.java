package sec01.interface01;

public class InterfaceExample01 {

	public static void main(String[] args) {
		
		IPhone p1 = new IPhone();
		SmartPhone s1 = new IPhone();
		Phone p2 = new IPhone();
		
		p1.turnOn(); // 단순 상속
		s1.turnOff();; // 다형성
		p2.turnOff();
		
	}
	
}
