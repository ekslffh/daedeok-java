package sec;

public class Tv extends Products {

	private boolean isCaption;
	private int size;
	
	public Tv(String name, int price, int stocks, boolean isCpation, int size) {
		super(name, price, stocks);
		this.isCaption = isCpation;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nisCaption : " + isCaption + "\nsize : " + size;
	}
	
}
