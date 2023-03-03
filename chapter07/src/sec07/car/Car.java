package sec07.car;

public abstract class Car {
	
	public void startCar() {
		System.out.println("�õ��� �Ѵ�");
	}
	
	public void turnOff() {
		System.out.println("������ ���ߴ�");
	}
	
	final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
	protected abstract void drive();
	protected abstract void stop();
}
