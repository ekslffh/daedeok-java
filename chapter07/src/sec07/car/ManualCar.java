package sec07.car;

public class ManualCar extends Car {

	@Override
	protected void drive() {
		System.out.println("����� ���� �����Ѵ�");
	}

	@Override
	protected void stop() {
		System.out.println("�����ڰ� �극��ũ�� ����Ͽ� ���� ����ϴ�");
	}

}
