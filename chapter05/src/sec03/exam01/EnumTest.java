package sec03.exam01;

public class EnumTest {

	public static void main(String[] args) {

		Week w1 = Week.MONDAY;
		Week w2 = Week.MONDAY;
//		System.out.println(w1 == w2);
		for (Week w : Week.values()) {
			System.out.println(w.getLable());
		}
		
	}

}

enum Week {
	MONDAY("월요일"),
	TUESDAY("화요일"),
	WENDESDAY("수요일"),
	THURSDAY("목요일"),
	FRIDAY("금요일"),
	SATURDAY("토요일"),
	SUNDAY("일요일");
	
	private String label;
	
	Week(String label) {
		this.label = label;
	}
	
	public String getLable() {
		return label;
	}
	
}
