package sec07.car;

public class AICar extends Car {

	@Override
	protected void drive() {
		System.out.println("���� ������ �մϴ�");
	}

	@Override
	protected void stop() {
		System.out.println("�ڵ����� ������ ���ߴϴ�");
	}

}
