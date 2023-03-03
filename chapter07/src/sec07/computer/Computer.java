package sec07.computer;

public abstract class Computer {
	boolean turnOn = false;
	protected abstract void display();
	protected abstract void typing();
	
	public void turnOn() {
		turnOn = true;
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		turnOn = !turnOn;
		System.out.println("전원을 끕니다");
	}
}