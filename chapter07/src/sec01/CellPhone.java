package sec01;

public class CellPhone {
	
	String model;
	String color;
	
	CellPhone() {
		model = "z플립";
		color = "노란색";
	}
	
	void powerOn() {
		System.out.println("전원을 켠다");
	}
	
	void powerOff() {
		System.out.println("전원을 끄다");
	}
	
	void bell() {
		System.out.println("벨이 울리다");
	}
	
	void hangUp() {
		System.out.println("전화를 끊다");
	}
	
}
