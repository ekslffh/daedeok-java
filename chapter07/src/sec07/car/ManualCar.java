package sec07.car;

public class ManualCar extends Car {

	@Override
	protected void drive() {
		System.out.println("사람이 직접 운전한다");
	}

	@Override
	protected void stop() {
		System.out.println("운전자가 브레이크를 사용하여 차를 멈춥니다");
	}

}
