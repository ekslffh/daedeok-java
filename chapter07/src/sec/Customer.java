package sec;

public class Customer {
	
	private int money;
	private int bonusPoint;
	Products[] cart = new Products[10];
	private int idx = 0;
	
	Customer() {
		money = 10000;
		bonusPoint = 0;
	}
	
	Customer(int money) {
		this.money = money;
		this.bonusPoint = 0;
	}
	
	void buy(Products p) {
		money -= p.price;
		p.stocks--;
		bonusPoint += p.bonusPoint;
		cart[idx++] = p;
	}
	
	void listAll() {
		int sum = 0; // 구매금액 합계
		String shoppingList = "";
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) break;
			sum += cart[i].price;
			shoppingList += cart[i].name + ", ";
		}
		System.out.println("구매 총 금액 : " + sum);
		System.out.println("구매상품 LIST : " + shoppingList);
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
}
