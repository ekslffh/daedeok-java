package sec07.computer;

public abstract class Computer {
	boolean turnOn = false;
	protected abstract void display();
	protected abstract void typing();
	
	public void turnOn() {
		turnOn = true;
		System.out.println("������ �մϴ�");
	}
	
	public void turnOff() {
		turnOn = !turnOn;
		System.out.println("������ ���ϴ�");
	}
}