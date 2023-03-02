package sec05;

// 문제] 다음은 Car class이다. 이 클래스를 Bus 클래스가 상속받고,
//	 	Bus 클래스에서 run메서드를 오버라이드 하시오.
//		Bus 클래스에서 run메서드는 "차가 주행하면서 다음 정류장정보를
//		방송합니다"를 출력하도록 구현하시오
public class Car {
	public void run() {
		System.out.println("car 클래스의 run메소드");
	}
}

class Bus extends Car {
	@Override
	public void run() {
		System.out.println("차가 주행하면서 다음 정류장정보를 방송합니다");
	}
}
