package sec03.exam01;

import java.util.Arrays;

public class ExampleEnum01 {

	public static void main(String[] args) {
		
		Season1 s1 = Season1.WINTER;
		System.out.println("지금은 이곳의 계절은 " + s1 + "입니다");
		
		// values() : 열거형 상수를 배열로 반환
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
	
	private enum Season2 { // 생성자가 필요
		SPRING("봄"),
		SUMMER("여름"),
		FALL("가을"),
		WINTER("겨울");
		
		private String season; 
		
		Season2(String season) {
			this.season = season;
		}
		
		public String getSeason() { // 생성자 메서드
			return season;
		}
	}

}
