package sec;

public class SmartPhone extends Products {

	private String maker;
	
	public SmartPhone(String name, int price, int stocks, String maker) {
		super(name, price, stocks);
		this.maker = maker;
	}
	
	@Override
	public String toString() {
		return "SmartPhone";
	}

}
