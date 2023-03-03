package sec07.car;

public class AICar extends Car {

	@Override
	protected void drive() {
		System.out.println("자율 주행을 합니다");
	}

	@Override
	protected void stop() {
		System.out.println("자동차가 스스로 멈추니다");
	}

}
