package sec03.exam01;

import java.util.Arrays;

public class ExampleEnum01 {

	public static void main(String[] args) {
		
		Season1 s1 = Season1.WINTER;
		System.out.println("������ �̰��� ������ " + s1 + "�Դϴ�");
		
		// values() : ������ ����� �迭�� ��ȯ
		System.out.println(Arrays.toString(Season2.values()));
		
		System.out.print("[");
		for (Season2 type : Season2.values()) {
			System.out.print(type.getSeason() + ", ");
		}
		System.out.print("]");
		
	}
	
	private enum Season1 {
		SPRING, SUMMER, FALL, WINTER
	}
	
	private enum Season2 { // �����ڰ� �ʿ�
		SPRING("��"),
		SUMMER("����"),
		FALL("����"),
		WINTER("�ܿ�");
		
		private String season; 
		
		Season2(String season) {
			this.season = season;
		}
		
		public String getSeason() { // ������ �޼���
			return season;
		}
	}

}
