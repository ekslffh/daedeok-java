package sec;

public class Computer extends Products {

	String cpuType;
	
	public Computer(String name, int price, int stocks, String cpuType) {
		super(name, price, stocks);
		this.cpuType = cpuType;
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
	
}
