package sec;

public class HiMart {

	public static void main(String[] args) {

//		Products p1 = new Tv("LED TV", 10000, 10, true, 70);
		Customer cust1 = new Customer();
		cust1.buy(new Tv("LED TV", 10000, 10, true, 70));
		cust1.buy(new Computer("mac pro", 5000, 15, "intel-7"));
//		System.out.println("cust1의 보너스 포인트는 " + cust1.getBonusPoint());
//		System.out.println(p1 + "의 재고는 " + p1.stocks);
		cust1.listAll();
	}

}
