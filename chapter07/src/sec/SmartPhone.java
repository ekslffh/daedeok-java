package sec;

public class SmartPhone extends Products {

	int memorySize;
	
	public SmartPhone(String name, int price, int stocks, int memorySize) {
		super(name, price, stocks);
		this.memorySize = memorySize;
	}
	
	@Override
	public String toString() {
		return super.toString() + "메모리사이즈 : " + memorySize;
	}

}
