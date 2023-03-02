package sec;

public class Products {
	
	protected String name;
	protected int price;
	protected int stocks;
	protected int bonusPoint;
	
	public Products(String name, int price, int stocks) {
		this.name = name;
		this.price = price;
		this.stocks = stocks;
		this.bonusPoint = price / 10;
	}
	
	// 판매
	@Override
	public String toString() {
		return "상품명 : " + name + "\n판매가격 : " + price + "\n재고수량 : " + stocks;
	}
	
}
