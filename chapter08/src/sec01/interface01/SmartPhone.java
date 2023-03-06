package sec01.interface01;

public abstract class SmartPhone implements Phone {

	@Override
	public void turnOn() {
		System.out.println("[SmartPhone class] 전원을 켭니다");
	}

}

class IPhone extends SmartPhone {

	@Override
	public void turnOff() {
		System.out.println("[IPhone class] 전원을 끕니다");
	}
	
}
