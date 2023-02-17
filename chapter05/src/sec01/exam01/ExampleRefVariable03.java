package sec01.exam01;

public class ExampleRefVariable03 {

	public static void main(String[] args) {
		// String class
		// 생성방법
		// 1. 직접 literal 정의
		// - 생성 전 기억공간을 scan 하여 같은 자료이면 해당 주소만 전달
		// - 기억공간의 활용이 효율적이나 처리속도가 다소 느림
		// 2. new 연산자 사용
		// - new 가 사용된 횟수 만큼 별도 공간 확보
		// - 처리속도는 빠르나 동일자료 저장시 기억공간 낭비가 심해짐

		// 문자열자료는 저장되면 왼쪽부터 0~n까지 순번이 부여됨
		// **문자열 클래스의 주요 메서드
		// equals(Object) => 내용비교
		// charAt(int idx) => idx위치의 문자 반환
		// contains(charsequence ch) => ch문자열이 포함되어 있는지 여부
		// length() => 문자열 내의 문자의 수
		// toCharArray() => 문자배열로 변환
		// toString() => 내용반환(재정의)
		// valueOf() => 기본형 자료를 문자열 자료로 형변환
		Triangle t1 = new Triangle();
		String h1 = "Hi! java.";
		String h2 = new String("Hi! java.");
		
		if (h1 == h2) { // 주소 비교
			System.out.println("같은 기억장소 사용");
		} else {
			System.out.println("다른 기억장소 사용");
		}
		
		if (h1.equals(h2)) { // 내용
			System.out.println("같은 내용의 문자열");
		} else {
			System.out.println("서로 다른 문자열");
		}
		
		System.out.println(h1);
		System.out.println(t1);
		
		char[] arrCh = h1.toCharArray();
		
		for (int i = 0; i < arrCh.length; i++) {
			System.out.print((char)(arrCh[i] + 1));
		}
		
		System.out.println("\n" + h1.contains("ja"));
		
		Temp temp = new Temp();
		
		// 멤버변수 h3의 값이 null이어서 null pointer exception발생!
		if (temp.h3.substring(0, 1).equals("1") || temp.h3.substring(0, 1).equals("3")) {
			System.out.println("남성회원입니다.");
		} else {
			System.out.println("여성회원입니다.");
		}
		
//		for (int i = 0; i < h1.length(); i++) {
//			System.out.println(h1.charAt(i));
//		}
		
	}

}

class Temp {
	String h3="213"; // 멤버변수
	
	public Temp() {
		int t3; // 지역변수
	}
}
