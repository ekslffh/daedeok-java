package sec01.interface01;

public abstract class SmartPhone implements Phone {

	@Override
	public void turnOn() {
		System.out.println("[SmartPhone class] ������ �մϴ�");
	}

}

class IPhone extends SmartPhone {

	@Override
	public void turnOff() {
		System.out.println("[IPhone class] ������ ���ϴ�");
	}
	
}
