package sec;

public class Products {
	
	protected String name;
	protected int price;
	protected int stocks;
	
	public Products(String name, int price, int stocks) {
		this.name = name;
		this.price = price;
		this.stocks = stocks;
	}
	
	// �Ǹ�
	
	@Override
	public String toString() {
		return "��ǰ�� : " + name + "\n�ǸŰ��� : " + price + "\n������ : " + stocks;
	}
	
}
