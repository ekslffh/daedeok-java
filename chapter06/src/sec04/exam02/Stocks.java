package sec04.exam02;

public class Stocks {
	// 상품의 재고를 관리하는 재고클래스를 생성하시오.
	// 속성은 상품코드(prodID), 입고수량(incomeQty), 판매수량(saleQty), 재고수량(stockQty)이고
	// 매입처리(buy)와 판매처리(sale)를 수행하는 메서드와 상품정보를 출력하는 메서드(informProd)를 설계하시오.
	private String prodID;
	private int incomeQty; // 입고수량
	private int saleQty; // 판매수량
	private int stockQty; // 재고수량
	
	public Stocks() {}
	
	public Stocks(String prodID) {
		this.prodID = prodID;
	}
	
	public void buy(int quantity) { // 매입 -> 매입수량 증가, 재고수량 증가
		incomeQty += quantity;
		stockQty += quantity;
	}
	
	public void sale(int quantity) { // 매출 -> 매출수량 증가, 재고수량 감소 
		saleQty += quantity;
		stockQty -= quantity;
	}
	
	public void informProd() {
		System.out.println("상품코드: " + prodID);
		System.out.println("입고수량: " + incomeQty);
		System.out.println("판매수량: " + saleQty);
		System.out.println("재고수량: " + stockQty);
		System.out.println("-----------------");
	}
	
}
