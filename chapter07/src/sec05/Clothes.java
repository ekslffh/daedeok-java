package sec05;

public class Clothes {
	public void cutHeight() {
		System.out.println("���� ���̸� �����մϴ�..");
	}
	
	public void cutWidth() {
		System.out.println("���� ǰ�� �����մϴ�..");
	}
	
	public void getPrice() {
		System.out.println("������ 5000���Դϴ�.");
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
		System.out.println("������� : " + price);
	}
}