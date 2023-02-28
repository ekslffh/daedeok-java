package sec;

public class Computer extends Products {

	String cpuType;
	int ramSize;
	
	public Computer(String name, int price, int stocks, String cpuType, int ramSize) {
		super(name, price, stocks);
		this.cpuType = cpuType;
		this.ramSize = ramSize;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCPU타입 : " + cpuType + "\nRAM크기 : " + ramSize;
	}
	
}
