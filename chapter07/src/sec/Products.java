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
	
	// �Ǹ�
	@Override
	public String toString() {
		return "��ǰ�� : " + name + "\n�ǸŰ��� : " + price + "\n������ : " + stocks;
	}
	
}
