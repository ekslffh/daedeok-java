package sec05;

public class Clothes {
	public void cutHeight() {
		System.out.println("옷의 길이를 수선합니다..");
	}
	
	public void cutWidth() {
		System.out.println("옷의 품을 수선합니다..");
	}
	
	public void getPrice() {
		System.out.println("가격은 5000원입니다.");
	}
}

class Reform extends Clothes {
	private int price = 0;
	
	@Override
	public void cutHeight() {
		price += 5000;
	}
	
	@Override
	public void cutWidth() {
		price += 10000;
	}
	
	@Override
	public void getPrice() {
		System.out.println("수선비용 : " + price);
	}
}