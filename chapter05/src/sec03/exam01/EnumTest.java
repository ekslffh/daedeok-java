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
	MONDAY("������"),
	TUESDAY("ȭ����"),
	WENDESDAY("������"),
	THURSDAY("�����"),
	FRIDAY("�ݿ���"),
	SATURDAY("�����"),
	SUNDAY("�Ͽ���");
	
	private String label;
	
	Week(String label) {
		this.label = label;
	}
	
	public String getLable() {
		return label;
	}
	
}
