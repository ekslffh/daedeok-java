package sec01.interface01;

public class InterfaceExample01 {

	public static void main(String[] args) {
		
		IPhone p1 = new IPhone();
		SmartPhone s1 = new IPhone();
		Phone p2 = new IPhone();
		
		p1.turnOn(); // �ܼ� ���
		s1.turnOff();; // ������
		p2.turnOff();
		
	}
	
}
