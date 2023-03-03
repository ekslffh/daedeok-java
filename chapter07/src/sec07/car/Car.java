package sec07.car;

public abstract class Car {
	
	public void startCar() {
		System.out.println("시동을 켜다");
	}
	
	public void turnOff() {
		System.out.println("엔진을 멈추다");
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
